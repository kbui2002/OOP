package lab6.mypolynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        if (coeffs.length - 1 < 0) {
            return 0;
        }
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = coeffs[0] + "x^" + (coeffs.length - 1);
        for (int i = 1; i < coeffs.length - 1; i++) {
            result = result + " + " + coeffs[i] + "x^" + (coeffs.length - 1 - i);
        }
        result = result + " + " + coeffs[coeffs.length - 1];
        return result;
    }

    public double evaluate(Double x) {
        double powX = 1;
        double result = 0;
        for (int i = 0; i <= coeffs.length; i++) {
            result += coeffs[0] * powX;
            powX *= x;
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[] addArray = new double[Math.max(this.coeffs.length, right.coeffs.length)];
        int deg1 = Math.max(this.getDegree(), right.getDegree());
        int deg2 = Math.min(this.getDegree(), right.getDegree());
        double[] max;
        double[] min;
        if (this.getDegree() == deg1) {
            max = this.coeffs;
            min = right.coeffs;
        } else {
            min = this.coeffs;
            max = right.coeffs;
        }
        int index = 0;
        for (int i = 0; i < (deg1 - deg2); i++) {
            addArray[index] = max[i];
            index++;
        }
        int in = 0;
        for (int i = (deg1 - deg2); i <= max.length - 1; i++) {
            addArray[index] = max[i] + min[in];
            in++;
            index++;
        }
        System.out.println(Arrays.toString(addArray));
        return new MyPolynomial(addArray);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] newPoly = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                newPoly[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newPoly);
    }
}
