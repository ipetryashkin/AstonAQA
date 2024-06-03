public class Task11 {
    public static void main(String[] args) {
        method11();
    }

    public static void method11() {
        int[] arr = new int[100];
        for (int a = 0; a < arr.length; a++){
            arr [a] = a+1;
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
