package lab4;

import java.util.Scanner;

/**
 * 2 exercises on recursion
 */
public class ExercisesOnRecursion {
    // 2.1 method factorial recusive
    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return factorial(n - 1) * n;
    }

    // 2.2 method fibonacci recursive
    public static int fibonacci(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 2.4 gcd recursive
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // 2.3 length of running number sequence recursive
    public static String length(int n) {
        String number = String.valueOf(n);
        if (n == 1) {
            return "1";
        }
        return length(n - 1) + number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int number1 = sc.nextInt();

        System.out.println(number1 + "! = " + factorial(number1)); // 2.1

        System.out.println("fibonacci (" + number1 + ") = " + fibonacci(number1)); // 2.2

        System.out.println("The length number1 is: " + length(number1)); // 2.3

        System.out.print("Enter the number 2: ");
        int number2 = sc.nextInt(); // 2.4
        System.out.println("GCD = " + gcd(number1, number2));
    }

}