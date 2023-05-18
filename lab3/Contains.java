package lab3;

import java.util.Scanner;

/**
 * 2.5 contains
 */
public class Contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the value of array (separated by space): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Key compare: ");
        int key = sc.nextInt();

        System.out.println(contains(arr, key));
    }

    public static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
