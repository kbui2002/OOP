package lab2;

import java.util.Scanner;
/**
 * 1.3 Time table
 */
public class TimeTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        for (int row = -1; row <= size; row++) {
            if (row == -1) {
                System.out.print("   *\t|");
            } else if (row == 0) {
                System.out.print("------------");
            } else if (row > 0) {
                System.out.printf("%4d\t|", row);
            }

            for (int col = 1; col <= size; col++) {
                if (row == -1) {
                    System.out.printf("\t%4d", col);
                    continue;
                } else if (row == 0) {
                    System.out.print("--------");
                    continue;
                }

                System.out.printf("\t%4d", row * col);
            }
            System.out.println();
        }
        sc.close();
    }
}