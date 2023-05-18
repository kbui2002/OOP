package lab1;

import java.lang.Math;

/**
 * 2.3 Compute pi
 */
public class ComputePI {

    public static void try_0() {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
            if (denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1 / denominator;
            } else { // remainder of 0 or 2
                System.out.println("Impossible!!!");
            }
        }
        double pi = 4 * sum;
        System.out.println("The value of π: " + pi);
    }

    public static void try_1() {
        int MAX_TERM = 10000; // number of terms used in computation
        double sum = 0.0;
        for (int term = 1; term <= MAX_TERM; term++) { // term = 1, 2, 3, ...,MAX_TERM
            // term = 1, 2, 3, 4, ..., MAX_TERM
            if (term % 2 == 1) { // odd term number: add
                sum += (double) 1.0 / (term * 2 - 1);
            } else { // even term number: subtract
                sum -= (double) 1.0 / (term * 2 - 1);
            }
        }

        double pi = 4 * sum;
        System.out.println("The value of π: " + pi);
    }

    public static void try_2() {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
            if (denominator % 4 == 1) {
                sum += (double) 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= (double) 1 / denominator;
            } else { // remainder of 0 or 2
                System.out.println("Impossible!!!");
            }
        }
        double pi = 4 * sum;
        System.out.println("The value computed of π: " + pi);
        System.out.println("The value of π in statement of JDK: " + Math.PI);
        System.out.println("The percents of Math.PI: " + (pi / Math.PI) * 100);
    }

    public static void main(String[] args) {
        try_0();
        try_1();
        try_2();
    }
}