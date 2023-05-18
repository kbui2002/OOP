package lab3;

import java.util.Scanner;

/**
 * 2.1 exponent
 */
public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the expponent: ");
        int exponent = sc.nextInt();
        System.out.printf("%d raises to the power of %d is: %d%n", base, exponent, powWithCondition(base, exponent));
    }

    public static int powWithCondition(int base, int expos) {
        int pow = 1;
        for (int i = 0; i < expos; i++) {
            pow *= base;
        }
        return pow;
    }
}
