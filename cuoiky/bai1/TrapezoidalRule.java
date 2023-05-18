package cuoiky.bai1;

import java.util.Scanner;

public class TrapezoidalRule {

    static double f(double x) {
        return Math.sin(x) * Math.sin(x) * Math.cos(x);
    }

    public static double integrate(double a, double b) {
        return 0;
    }

    static double integrate(double a, double b, int N) {
        double h = (b - a) / N;
        double sum = 0.5 * (f(a) + f(b));
        for (int i = 1; i < N; i++) {
            double x = a + h * i;
            sum = sum + f(x);
        }

        return sum * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = sc.nextInt();
        double s;
        double result = integrate(a, b, n);
        do {
            s = result;
            n *= 2;
            result = integrate(a, b, n);

        } while (Math.abs(result - s) >= 0.000001);
        double verify = Math.pow(Math.sin(b), 3) / 3;
        System.out.printf("%.6f", result);
        System.out.println();
        System.out.printf("%.6f", verify);
    }
}