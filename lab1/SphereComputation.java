package lab1;

import java.util.Scanner;

/**
 * 3.2 try Sphere computation
 */
public class SphereComputation {
    public static void main(String[] args) {
        // Declare variables
        double radius;
        double surfaceArea; 
        double volume;
        Scanner sc = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble(); // read input as double

        // Compute in "double"
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 / 3 * Math.PI * radius * radius * radius;

        // Print results using printf() with the following format specifiers:
        // %.2f for a double with 2 decimal digits
        // %n for a newline
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
        sc.close();
    }
}