public class Task14 {
    public static void main(String[] args) {
        int[] result = method14(4,8);
        System.out.println("Массив");
        printarr(result);
    }

    public static int[] method14(int len, int initialValue) {
        int[] arr = new int[len];
        for (int o = 0; o < len; o++) {
            arr [o] = initialValue;
        }
        return arr;

    }

    public static void printarr(int[] arr) {
        for (int q = 0; q < arr.length; q++) {
            System.out.print(arr[q] + " ");
        }
    }

}
