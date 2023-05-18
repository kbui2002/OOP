package lab3;

import java.util.Scanner;

/**
 * 2.3 print
 */
public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];
        double[] arr1 = new double[arr.length];
        float[] arr2 = new float[arr.length];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Double.valueOf(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = Float.valueOf(arr[i]);
        }
        print(arr);
        System.out.println();
        print(arr1);
        System.out.println();
        print(arr2);
        System.out.println();
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
        }
    }

    public static void print(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.printf("%.2f", arr[i]);
            } else {
                System.out.printf(", %.2f", arr[i]);
            }
        }
    }

    public static void print(float arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.printf("%.2f", arr[i]);
            } else {
                System.out.printf(", %.2f", arr[i]);
            }
        }
    }
}
