package lab3;

import java.util.Scanner;

/**
 * 2.2 has eight
 */
public class HasEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int sum = 0;
        do {
            System.out.print("Enter a positive integer (or -1 to end): ");
            pos = sc.nextInt();
            if (test(pos)) {
                sum += pos;
            }
        } while (pos >= 0);
        System.out.println("The magic sum is: " + sum);
    }

    public static boolean test(int pos) {
        String s = String.valueOf(pos); // change pos to string
        if (s.contains("8")) {
            return true;
        } else {
            return false;
        }
    }
}
