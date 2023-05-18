package lab2;

import java.util.Scanner;
/**
 * 1.1 Square pattern
 */
public class SquarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        squarePattern(size);
    }
    public static void squarePattern(int size) {       
        for (int row = 1; row <= size; row++) {     // number of row
            for (int col = 1; col <= size; col++) {     // number of column 
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}