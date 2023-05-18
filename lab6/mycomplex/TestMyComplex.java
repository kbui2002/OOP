package lab6.mycomplex;

import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complex numer 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();

        System.out.println("Enter complex numer 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();

        // number 1
        MyComplex number1 = new MyComplex(real1, imag1);
        System.out.print("Number 1 is: " + number1.toString());

        // is real check
        if (number1.isReal() == true) {
            System.out.println(number1.toString() + " is a pure real number");
        } else {
            System.out.println(number1.toString() + " is a not pure real number");
        }

        // is imaginary check
        if (number1.isImaginary() == true) {
            System.out.println(number1.toString() + " is a pure imaginary number");
        } else {
            System.out.println(number1.toString() + " is a not pure imaginary number");
        }

        // number2
        MyComplex number2 = new MyComplex(real2, imag2);
        System.out.print("Number 2 is: " + number2.toString());

        // is real check
        if (number2.isReal() == true) {
            System.out.println(number2.toString() + "is a pure real number");
        } else {
            System.out.println(number2.toString() + "is a not pure real number");
        }

        // is imaginary check
        if (number2.isImaginary() == true) {
            System.out.println(number2.toString() + "is a pure imaginary number");
        } else {
            System.out.println(number2.toString() + "is a not pure imaginary number");
        }

        // equalcheck
        if (number1.equals(number2) == true) {
            System.out.println(number1.toString() + "is equal to" + number2.toString());
        } else {
            System.out.println(number1.toString() + "is equal to" + number2.toString());
        }

        // add
        System.out.println(number1.toString() + " + " + number2.toString() + " = " + number1.addInto(number2));

    }
}
