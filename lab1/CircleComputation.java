package lab1;

import java.util.Scanner;

/**
 * 3.2 Circle computation
 */
public class CircleComputation {
    public static void main(String[] args) {
        // Declare variables
        double radius;
        double diameter;
        double circumference;
        double area;
        Scanner sc = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble(); // read input as double

        // Compute in "double"
        diameter = (double) 2.0 * radius;
        area = (double) Math.PI * radius * radius;
        circumference = (double) 2.0 * Math.PI * radius;

        // Print results using printf() with the following format specifiers:
        // %.2f for a double with 2 decimal digits
        // %n for a newline
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Circumference is: %.2f%n", circumference);
        System.out.printf("Area is: %.2f%n", area);
        sc.close();
    }
}