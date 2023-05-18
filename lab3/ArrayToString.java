package lab3;

import java.util.Scanner;
/**
 * 2.4 array to string
 */
public class ArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");

        int size = sc.nextInt();
        int[] array = new int[size];
        
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(arrayToString(array));
    }

    public static String arrayToString(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                s += String.valueOf(arr[i]);
            } else {
                s += ", " + String.valueOf(arr[i]);
            }
        }
        return s;
    }
}
