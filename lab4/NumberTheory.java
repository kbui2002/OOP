package lab4;

import java.util.*;

/**
 * 4 number theory
 */
public class NumberTheory {
	// 4.1 perfect and deficient number
	public static boolean isPerfect(int aPosInt) {
		int sumDivesor = 0;
		for (int divisor = 1; divisor <= aPosInt / 2; divisor++) {
			if (aPosInt % divisor == 0) {
				sumDivesor += divisor;
			}
		}
		if (sumDivesor == aPosInt) {
			return true;
		}
		return false;
	}

	public static boolean isDeficient(int aPosInt) {
		int sumDivisor = 0;
		for (int divisor = 1; divisor <= aPosInt / 2; divisor++) {
			if (aPosInt % divisor == 0) {
				sumDivisor += divisor;
			}
		}
		if (sumDivisor < aPosInt) {
			return true;
		}
		return false;
	}

	// 4.2 prime number
	public static boolean isPrime(int aPosInt) {
		if (aPosInt == 1) {
			return false;
		}
		for (int divisor = 2; divisor <= Math.sqrt(aPosInt); divisor++) {
			if (aPosInt % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	// 4.3 prime factors
	public static boolean isProductOfPrimeFactors(int aPosInt) {
		int number = 0, multi = 1;
		for (int divisor = 2; divisor < aPosInt; divisor++) {
			if (aPosInt % divisor == 0 && isPrime(divisor) && divisor > number) {
				number = divisor;
				multi *= divisor;
			}
		}
		if (multi == aPosInt) {
			return true;
		}
		return false;
	}

	// 4.4 greatest common divisor
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper bound: ");
		int numberUpper = sc.nextInt();
		int countP = 0, count = 0; // Exercises 4.1
		System.out.println("These numbers are perfect: ");
		for (int number = 1; number <= numberUpper; number++) {
			if (isPerfect(number)) {
				countP++;
				System.out.print(number + " ");
			}
		}
		float percentP = (float) countP * 100 / numberUpper;
		System.out.printf("\n[%d perfect numbers found (%.2f%%)]", countP, percentP);
		System.out.println("\nThese numbers are neither deficient nor perfect: ");
		for (int number = 1; number <= numberUpper; number++) {
			if (isPerfect(number) == false && isDeficient(number) == false) {
				count++;
				System.out.print(number + " ");
			}
		}
		float percent = (float) count * 100 / numberUpper;
		System.out.printf("\n[%d numbers found (%.2f%%)]", count, percent);

		System.out.println();
		int countPrime = 0; // Exercises 4.2
		for (int number = 1; number <= numberUpper; number++) {
			if (isPrime(number)) {
				countPrime++;
				System.out.println(number);
			}
		}
		float percentPrime = (float) countPrime * 100 / numberUpper;
		System.out.printf("[%d numbers found (%.2f%%)]\n", countPrime, percentPrime);

		int countProduct = 0; // Exercises 4.3
		System.out.println("These numbers are equal to the product of prime factors: ");
		for (int number = 1; number <= numberUpper; number++) {
			if (isProductOfPrimeFactors(number)) {
				countProduct++;
				System.out.print(number + " ");
			}
		}
		float percentProduct = (float) countProduct * 100 / numberUpper;
		System.out.printf("\n[%d numbers found (%.2f%%)]", countProduct, percentProduct);

		System.out.print("\nEnter the number1 and number2: "); // Exercises 4.4
		int number1 = sc.nextInt(), number2 = sc.nextInt();
		if (number2 <= number1) {
			System.out.println("GCD is: " + gcd(number1, number2));
		} else {
			System.out.println("GCD is: " + gcd(number2, number1));
		}
	}
}
