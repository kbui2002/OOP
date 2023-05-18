package lab3;

import java.util.Scanner;

/**
 * 2.10 reverse
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the value of array 1 (separated by space): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println();
    }

    public static void reverse(int[] arr) {
        int[] new_arr = new int[arr.length];
        int run = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[run];
            run--;
        }
        for (int p : new_arr) {
            System.out.print(p + " ");
        }
    }
}
