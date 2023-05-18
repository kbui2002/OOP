package lab6.mypolynomial;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 6.6, 5.5);

        System.out.println(polynomial1);
        System.out.println(polynomial2);

        System.out.println("Degress is " + polynomial1.getDegree());

        System.out.println("polynomial1 + polynomial2 is " + polynomial1.add(polynomial2));

        System.out.println();

        double[] coeffs = { 1, 2, 1 };
        MyPolynomial polynomial3 = new MyPolynomial(coeffs);
        double[] coeffs2 = { 1, 1 };
        MyPolynomial polynomial4 = new MyPolynomial(coeffs2);

        System.out.println(polynomial3.multiply(polynomial4));
    }
}
