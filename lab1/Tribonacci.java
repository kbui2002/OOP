package lab1;

/**
 * 2.4 try tribonaci
 */
public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;
        int tn; // F(n) to be computed
        int tnMinus1 = 1; // F(n-1), init to F(2)
        int tnMinus2 = 1; // F(n-2), init to F(1)
        int tnMinus3 = 1;
        int nMax = 20; // maximum n, inclusive
        System.out.println("The first " + nMax + " Tribonacci numbers are:");
        System.out.print(tnMinus1 + " " + tnMinus2 + " " + tnMinus3 + " ");

        while (n <= nMax) { // n starts from 3
            // n = 3, 4, 5, ..., nMax
            // Compute F(n), print it and add to sum
            tn = tnMinus1 + tnMinus2 + tnMinus3;
            System.out.print(tn + " ");
            // Increment the index n and shift the numbers for the next iteration
            n++;
            tnMinus2 = tnMinus1;
            tnMinus1 = tn;
        }
    }
}