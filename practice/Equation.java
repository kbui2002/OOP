package practice;

import java.util.Scanner;

public class Equation {

    public static int delta(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public static void checkEquation(int a, int b, int c) {
        int deltaNum = delta(a, b, c);
        if (a == 0) {
            System.out.println("INF");
        } else {
            if (deltaNum < 0) {
                System.out.println("NO");
            } else if (deltaNum == 0) {
                System.out.println();
            }
        }
    }

    public static String toString(int a, int b, int c) {
        return a + " x^2 " + b + " x " + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

    }
}
