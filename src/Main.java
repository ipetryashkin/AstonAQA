public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "1", "1","1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4"}
        };

        try {
            int sum = sizeAndSumArray(arr);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int sizeAndSumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Неверный размер массива! Размер массива должен быть 4x4!");
        }

        int sum = 0;

        for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {
            if (arr[rowIndex].length != 4) {
                throw new MyArraySizeException("Неверный размер массива! Размер массива должен быть 4x4!");
            }

            for (int columnIndex = 0; columnIndex < arr[rowIndex].length; columnIndex++) {
                try {
                    sum += Integer.parseInt(arr[rowIndex][columnIndex]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + (rowIndex + 1) + "][" + (columnIndex + 1) + "]");
                }
            }
        }

        return sum;
    }
}