package lab3;

import java.util.Scanner;

/**
 * 2.9 swap
 */
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size array 1: ");
        int size1 = sc.nextInt();

        System.out.print("Enter the value of array 1 (separated by space): ");
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size array 2: ");
        int size2 = sc.nextInt();

        System.out.print("Enter the value of array 2 (separated by space): ");
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(swap(arr1, arr2));
    }

    public static boolean swap(int[] arr1, int arr2[]) {
        if (arr1 != null && arr2 != null) {
            if (arr1.length == arr2.length) {
                for (int i = 0; i < arr1.length; i++) {
                    int temp = arr1[i];
                    arr1[i] = arr2[i];
                    arr2[i] = temp;
                }
                return true;
            }
        }
        return false;
    }
}
