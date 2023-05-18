package lab4;

/**
 * 1.5 fibonacci int
 */
public class FibonacciInt {
    //
    public static void checkFibonacci() {
        // Declare variables
        int fn_2 = 1;
        int fn_1 = 1;
        int fn = fn_2 + fn_1;
        int n = 2;

        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while (true) {
            if (Integer.MAX_VALUE - fn_1 < fn_2) {
                System.out.printf("F(%d) is out of range of int", n);
                break;
            }
            System.out.printf("F(%d) = %d %n", n, fn);
            fn_2 = fn_1;
            fn_1 = fn;
            fn = fn_2 + fn_1;
            n++;
        }
    }

    //
    public static void checkTribonacci() {
        // Declare variables
        int fn_3 = 1;
        int fn_2 = 1;
        int fn_1 = 2;
        int fn = fn_3 + fn_2 + fn_1;
        int n = 3;

        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");
        while (true) {
            if (Integer.MAX_VALUE - fn_1 - fn_2 < fn_3) {
                System.out.printf("F(%d) is out of range of int", n);
                break;
            }
            System.out.printf("F(%d) = %d %n", n, fn);
            fn_3 = fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            fn = fn_3 + fn_2 + fn_1;
            n++;
        }
    }

    public static void main(String[] args) {
        checkTribonacci();
    }
}
