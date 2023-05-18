package lab3;

import java.util.Scanner;

/**
 * 1.3 grade statistic
 */
public class GradeStatistic {
    public static void main(String[] args) {
        // Read the input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        int[] students = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            students[i] = sc.nextInt();
        }

        int sum = 0;
        int max = students[1];
        int min = students[1];

        for (int i = 0; i < number; i++) {
            sum += students[i];
            if (max < students[i]) {
                max = students[i];
            }
            if (min > students[i]) {
                min = students[i];
            }
        }

        System.out.println("The average is: " + (double) sum / (double) number);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
