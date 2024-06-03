public class Task5 {
    public static void main(String[] args) {
        method5(6, 13);
    }

    public static boolean method5(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return true;
    }
}