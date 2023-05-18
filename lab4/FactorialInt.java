package lab4;

/**
 * 1.4 factorial int
 */
public class FactorialInt {
    //
    public static void checkFactorialInteger() {
        int num = 1;
        int factorial = 1;
        while (true) {

            if ((Integer.MAX_VALUE / factorial) < (num + 1)) {
                System.out.printf("The factorial of %d is out of range %n", num);
                break;
            }

            int factotialTemp = 1;
            for (int i = 1; i <= num; i++) {
                factotialTemp *= i;
            }

            System.out.printf("The factorial of %d is %d %n", num, factotialTemp);
            factorial = factotialTemp;
            num++;
        }
    }

    //
    public static void checkFactorialLong() {
        long num = 1;
        long factorial = 1;
        while (true) {

            if ((Long.MAX_VALUE / factorial) < (num + 1)) {
                System.out.printf("The factorial of %d is out of range %n", num);
                break;
            }

            long factotialTemp = 1;
            for (long i = 1; i <= num; i++) {
                factotialTemp *= i;
            }

            System.out.printf("The factorial of %d is %d %n", num, factotialTemp);
            factorial = factotialTemp;
            num++;
        }
    }

    public static void main(String[] args) {
        checkFactorialLong();
    }
}
