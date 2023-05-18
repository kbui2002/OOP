package lab4;

/**
 * 1.2 trigonometric series
 */
public class TrigonometricSeries {

    public static double sin(double x, int numTerms) {
        double result = x;
        double numDouble = x;
        for (int i = 1; i < numTerms; i++) {
            numDouble *= (-1.0) * (x * x) / ((2 * i + 1) * 2 * i);
            result += numDouble;
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 1;
        double numDouble = 1;
        for (int i = 1; i < numTerms; i++) {
            numDouble *= (-1.0) * (x * x) / ((2 * i - 1) * 2 * i);
            result += numDouble;
        }
        return result;
    }

    public static void main(String[] agrs) {
        System.out.println(Math.sin(Math.PI / 2));
        System.out.println("sin is " + sin(Math.PI / 2, 10000));
        System.out.println(Math.cos(Math.PI / 4));
        System.out.println("cos is " + cos(Math.PI / 4, 10000));
    }

}