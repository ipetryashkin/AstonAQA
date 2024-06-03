public class Task10 {
    public static void main(String[] args) {
        method10();
    }

    public static void method10() {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 1;
        arr[8] = 0;
        arr[9] = 0;
        System.out.println("Старый массив");
        printarr(arr);
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] == 0) {
                arr[m] = 1;
            } else {
                arr[m] = 0;
            }
        }
        System.out.println("Новый массив");
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("");
    }
}
