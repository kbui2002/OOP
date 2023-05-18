package thicuoiky.bai1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Fraction extends Number implements Comparable<Fraction> {

    private int numerator;
    private int denominator;

    /**
     * Creates a new instance of Fraction
     */

    public Fraction(Fraction another) {
        this.numerator = another.numerator;
        this.denominator = another.denominator;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public int getNumerator() {

        return numerator;
    }

    public void setNumerator(int numerator) {

        this.numerator = numerator;
    }

    public int getDenominator() {

        return denominator;

    }

    public void setDenominator(int denominator) {

        this.denominator = denominator;

    }

    public String toString() {

        return "Fraction[" + numerator + "/" + denominator + "]";

    }

    public boolean equals(Fraction other) {

        return (this.numerator == other.getNumerator() && this.denominator == other.getDenominator());

    }

    public double doubleValue() {

        return (double) numerator / denominator;

    }

    public float floatValue() {

        return (float) numerator / denominator;

    }

    public int intValue() {
        return (int) numerator / denominator;
    }

    public long longValue() {
        return (long) numerator / denominator;
    }

    public int compareTo(Fraction other) {
        return compareTo(other);
    }

    private static int gcd(int m, int n) {

        int max = Math.max(m, n);
        int i;
        for (i = max; i > 1; i--) {
            int rem1 = m % i;
            int rem2 = n % i;
            if (rem1 == 0 && rem2 == 0) {
                return i;
            }
        }
        return 1;
    }

    private void simplify() {
        int temp = gcd(numerator, denominator);
        while (temp != 1 || temp != 0) {
            denominator /= temp;
            numerator /= temp;
            temp = gcd(numerator, denominator);
        }
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction add(Fraction other) {

        int newDen = this.denominator * other.numerator + this.numerator * other.denominator;
        int newNom = this.denominator * other.denominator;
        return new Fraction(newNom, newDen);

    }

    public Fraction add(int other) {
        int otherNumerator = other;
        Fraction sum = new Fraction(numerator + otherNumerator, denominator);
        sum.simplify();
        return sum;
    }
}