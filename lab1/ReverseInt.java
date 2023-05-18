package lab1;

import java.util.Scanner;

/**
 * 3.5 Reverse int
 */
public class ReverseInt {
    public static void main(String[] args) {
        // Declare variables
        int inNumber; // to be input
        int inDigit; // each digit
        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        inNumber = sc.nextInt();
        // Extract and drop the "last" digit repeatably using a while-loop with
        // modulus/divide operations
        while (inNumber > 0) {
            inDigit = inNumber % 10; // extract the "last" digit
            // Print this digit (which is extracted in reverse order)
            reverse = reverse * 10 + inDigit;
            inNumber /= 10; // drop "last" digit and repeat
        }

        System.out.println("The reverse is: " + reverse);
        sc.close();
    }
}