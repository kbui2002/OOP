package lab3;

import java.util.Scanner;

/**
 * 1.2 print array in stars
 */
public class PrintArrayInStars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");

        int num_item = sc.nextInt();
        int[] item = new int[num_item];

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < item.length; i++) {
            item[i] = sc.nextInt();
        }

        for (int i = 0; i < item.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < item[i]; j++) {
                System.out.print("* ");
            }
            System.out.print("(" + item[i] + ")");
            System.out.println();
        }
    }
}
