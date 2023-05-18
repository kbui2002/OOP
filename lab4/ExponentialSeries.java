package lab4;

import java.util.Scanner;

/**
 * 1.3 exponential series
 */
public class ExponentialSeries {
    //
    public static double elementFactor(double x, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result / n;
    }

    //
    public static double specialSeries(double x, int numTerms) {
        double result = x;
        double mauSo = 0;
        double tmp = 1;
        for (int i = 3; i <= numTerms; i += 2) {
            mauSo += 2;
            tmp *= (mauSo - 1) / mauSo;
            result += (tmp * elementFactor(x, numTerms));
        }
        return result;
    }

    //
    public static void printResults(double x, int numTerms) {
        System.out.printf("Special series is: %.10f", specialSeries(x, numTerms));
    }

    // Main METHOD
    public static void main(String[] args) {
        // Declare variables
        Scanner in = new Scanner(System.in);
        System.out.print("Enter varibale x: ");
        double x = in.nextDouble();
        System.out.print("Enter varibale numTerms: ");
        int numTerms = in.nextInt();

        if (x > 1 || x < -1) {
            System.out.println("Please enter x in range [-1,1]");
        } else {
            printResults(x, numTerms);
        }

    }
}
