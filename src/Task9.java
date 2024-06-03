public class Task9 {
    public static void main(String[] args) {
        boolean result = method9 (2300);
        System.out.println (result);
    }

    public static boolean method9(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}