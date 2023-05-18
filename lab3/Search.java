package lab3;

import java.util.Scanner;

/**
 * 2.6 search
 */
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.print("Enter the value of all items (separated by space): ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Key compare: ");
        int key = sc.nextInt();
        System.out.println(search(arr, key));
    }

    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
