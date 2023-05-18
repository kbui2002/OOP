package lab3;

import java.util.Scanner;

/**
 * 2.8 copy of
 */
public class CopyOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.print("Enter the value of array (separated by space): ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter new length: ");
        int new_length = sc.nextInt();
        for (int p : copyOf(arr, new_length)) {
            System.out.print(p + " ");
        }
    }

    public static int[] copyOf(int arr[], int newLength) {
        if (newLength == arr.length) {
            return arr;
        } else {
            int newArr[] = new int[newLength];
            for (int i = 0; i < newArr.length; i++) {
                if (i >= arr.length - 1)
                    newArr[i] = 0;
                else
                    newArr[i] = arr[i];
            }
            return newArr;
        }
    }
}
