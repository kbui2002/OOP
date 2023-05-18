package thicuoiky.bai1;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class TestFraction {
    private List<Fraction> fractions;

    public static void main(String[] args) {

        TestFraction test = new TestFraction();
        test.fractions = new ArrayList<Fraction>();
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            Fraction fraction = new Fraction(rand.nextInt(1000), rand.nextInt(1000));
            test.fractions.add(fraction);
        }
        System.out.println(test.fractions);
        System.out.println(sortByValue(test.fractions));
        System.out.print(sortByDenominator(test.fractions));
        System.out.println(test.getSecondLargestValue().toString());
    }

    public static List<Fraction> sortByValue(List<Fraction> fractions) {
        int n = fractions.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                if (((Fraction) fractions.get(i)).compareTo((Fraction) fractions.get(j)) > 1) {
                    Fraction temp = new Fraction(fractions.get(i));
                    fractions.set(i, new Fraction(fractions.get(j)));
                    fractions.set(j, new Fraction(temp));
                }
            }
        }
        return fractions;
    }

    public static List<Fraction> sortByDenominator(List<Fraction> fractions) {
        int n = fractions.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                if (fractions.get(i).getDenominator() > fractions.get(j).getDenominator()) {
                    Fraction temp = new Fraction(fractions.get(i));
                    fractions.set(i, new Fraction(fractions.get(j)));
                    fractions.set(j, new Fraction(temp));
                }
            }
        }
        return fractions;
    }

    public static void print(List<Fraction> fractions) {

        int n = fractions.size();
        for (int i = 0; i < n; i++) {
            System.out.print(fractions.get(i).toString() + ", ");
        }
    }

    public Fraction getSecondLargestValue() {
        List<Fraction> sorted = sortByValue(this.fractions);
        int n = sorted.size();
        return sorted.get(n - 2);
    }
}
