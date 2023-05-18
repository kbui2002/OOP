package lab1;

import java.util.Scanner;

/**
 * 3.1 Sum product min max 3
 */
public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scan the keyboard

        System.out.print("Enter 1st integer: ");
        int number1 = in.nextInt();

        System.out.print("Enter 2nd integer: ");
        int number2 = in.nextInt();

        System.out.print("Enter 3rd integer: ");
        int number3 = in.nextInt();
        in.close();
        // Compute sum and product
        int sum = number1 + number2 + number3;
        int product = number1 * number2 * number3;
        int min = Math.min(Math.min(number1, number2), number3);
        int max = Math.max(Math.max(number1, number2), number3);

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}