package lab4;

import java.util.Scanner;
import java.lang.Math;

/**
 * 1.7 number guess
 */
public class NumberGuess {
    //
    public static void randomGuess() {
        Scanner sc = new Scanner(System.in);
        final int key = (int) (Math.random() * 99); // 1 to 99
        System.out.print("Enter your guess: ");
        int num = sc.nextInt();
        int i = 1;
        if (num < key) {
            System.out.println("     => Try higher");
        } else if (num > key) {
            System.out.println("     => Try lower");
        } else {
            System.out.println("     => You got it in " + i + " trials!");
        }
        while (num != key) {
            i++;
            System.out.print("Enter your guess: ");
            num = sc.nextInt();
            if (num < key) {
                System.out.println("     => Try higher");
            } else if (num > key) {
                System.out.println("     => Try lower");
            } else {
                System.out.println("     => You got it in " + i + " trials!");
            }
        }
    }

    public static void main(String[] args) {
        randomGuess();
    }
}
