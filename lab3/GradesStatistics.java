package lab3;

import java.util.Scanner;

/**
 * 2.11 grade statistics
 */
public class GradesStatistics {
    public static double avg(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / (double) arr.length;
    }

    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int minArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    public static double median(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        double sum = 0.0;
        if (arr.length % 2 == 0) {
            sum = arr[arr.length / 2 - 1] + arr[arr.length / 2];
            return sum / 2;
        }
        sum = arr[(arr.length - 1) / 2];
        return sum;
    }

    public static double deviation(int[] arr) {
        int sumsq = 0;
        for (int i = 0; i < arr.length; i++) {
            sumsq += arr[i] * arr[i];
        }
        return Math.sqrt(((double) sumsq) / arr.length - (avg(arr) * avg(arr)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int num_item = sc.nextInt();
        int[] item = new int[num_item];

        for (int i = 0; i < item.length; i++) {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            item[i] = sc.nextInt();
        }

        System.out.print("The grades are: [");
        for (int j = 0; j < item.length - 1; j++) {
            System.out.print(item[j] + ", ");
        }
        System.out.println(item[item.length - 1] + "]");
        System.out.printf("The average is: %.2f%n", avg(item));
        System.out.printf("The median is: %.2f%n", median(item));
        System.out.printf("The minimum is: %d%n", minArr(item));
        System.out.printf("The maximum is: %d%n", maxArr(item));
        System.out.printf("The standard deviation is: %.2f%n", deviation(item));
    }
}
