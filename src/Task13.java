public class Task13 {
    public static void main(String[] args) {
        method13();
    }

    public static void method13() {
        int dim = 5;
        int[][] arr = new int[dim][dim];
        for (int r = 0; r < dim; r++) {
            for (int t = 0; t < dim; t++) {
                if (r == t) {
                    arr[r][t] = 1;
                }
            }
        }
        for (int r = 0; r < dim; r++) {
            for (int t = 0; t < dim; t++) {
                if (dim-r-1 == t) {
                    arr[r][t] = 1;
                }
            }
        }
        System.out.println("Массив");
        printmatrix(arr,dim);


    }

    public static void printmatrix(int[][] arr, int dim) {
        for (int a = 0; a < dim; a++) {
            for (int b = 0; b < dim; b++) {
                System.out.print(arr[a][b]+" ");
            }
            System.out.println("");
        }
    }
}
