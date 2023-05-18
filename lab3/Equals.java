package lab3;

import java.util.Scanner;

/**
 * 2.7 equals
 */
public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size array 1: ");
        int size1 = sc.nextInt();
        System.out.print("Enter the size array 2: ");
        int size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        if (arr1.length == arr2.length) {
            System.out.print("Enter the input array 1(separated by space): ");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.print("Enter the input array 2(separated by space): ");

            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.println(equals(arr1, arr2));
        } else {
            System.out.println("fail");
        }
    }

    public static int[] sortIcrs(int arr[]) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static boolean equals(int arr1[], int[] arr2) {
        if (arr1 != null && arr2 != null) {
            arr1 = sortIcrs(arr1);
            arr2 = sortIcrs(arr2);
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i])
                    count++;
            }
            if (count == arr1.length)
                return true;
        }
        return false;
    }
}
