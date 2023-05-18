package lab1;

/**
 * 2.1 Sum average running int
 */
public class SumAverageRunningInt {

    public static void try_0() {
        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }

        double average = (double) sum / 100;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("The average is: " + average);
    }

    public static void try_1() {
        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int number = LOWERBOUND; // declare and init loop index variable
        while (number <= UPPERBOUND) { // test
            sum += number;
            ++number; // update
        }

        double average = (double) sum / 100;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("The average is: " + average);
    }

    public static void try_2() {
        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int number = LOWERBOUND; // declare and init loop index variable
        do {
            sum += number;
            ++number; // update
        } while (number <= UPPERBOUND);

        double average = (double) sum / 100;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("The average is: " + average);
    }

    public static void try_3() {
        int sum = 0;
        final int LOWERBOUND = 111;
        final int UPPERBOUND = 8899;

        int count = 0; // Count the number within the range, init to 0
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            ++count;
        }

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }

        double average = (double) sum / count;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        System.out.println("The average is: " + average);
    }

    public static void try_4() {
        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number * number;
        }

        System.out.println(sum);
    }

    public static void try_5() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int sumOdd = 0; // Accumulating sum of odd numbers
        int sumEven = 0; // Accumulating sum of even numbers
        int absDiff; // Absolute difference between the two sums
        // Compute sums
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 != 0) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }
        // Compute Absolute Difference
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Absolute difference: " + absDiff);
    }

    public static void main(String[] args) {
        try_0();
        try_1();
        try_2();
        try_3();
        try_4();
        try_5();
    }
}