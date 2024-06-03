public class Task12 {
    public static void main(String[] args) {
        method12();
    }

    public static void method12() {
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 11;
        arr[5] = 4;
        arr[6] = 5;
        arr[7] = 2;
        arr[8] = 4;
        arr[9] = 8;
        arr[10] = 9;
        arr[11] = 1;
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] < 6) {
                arr[r] = arr[r] * 2;
            }
        }
        System.out.println("Массив");
        printarr(arr);

    }

    public static void printarr(int[] arr) {
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
