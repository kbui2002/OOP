package lab1;

import java.util.Scanner;

/**
 * 3.2 try Cylinder computation
 */
public class CylinderComputation {
    public static void main(String[] args) {
        // Declare variables
        double radius;
        double height;
        double baseArea;
        double surfaceArea;
        double volume;
        Scanner sc = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble(); // read input as double
        System.out.print("Enter the height: ");
        height = sc.nextDouble(); // read input as double

        // Compute in "double"
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;

        // Print results using printf() with the following format specifiers:
        // %.2f for a double with 2 decimal digits
        // %n for a newline
        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
        sc.close();
    }
}