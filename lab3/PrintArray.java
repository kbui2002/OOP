package lab3;

import java.util.Scanner;

/**
 * 1.1 print array
 */
public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int num_items = sc.nextInt();

        int[] item = new int[num_items];
        if (item.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < item.length; i++) {
                item[i] = sc.nextInt();
            }
        }

        System.out.print("The values are: [");
        for (int i = 0; i < item.length; i++) {
            if (i < item.length - 1)
                System.out.print(item[i] + ", ");
            else
                System.out.print(item[i]);
        }
        System.out.println("]");
    }
}