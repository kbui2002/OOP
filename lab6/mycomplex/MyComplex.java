package lab6.mycomplex;

/**
 * 1.1
 */

public class MyComplex {
    double real;
    double imag;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + this.real + "+" + this.imag + "i" + ")";
    }

    public boolean isReal() {
        if (this.imag == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isImaginary() {
        if (this.real == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(MyComplex another) {
        if (this.real == another.real && this.imag == another.imag) {
            return true;
        } else {
            return false;
        }
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real = this.real + right.getReal();
        this.imag = this.imag + right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex(0.0, 0.0);
        newComplex.setReal(this.real + right.getReal());
        newComplex.setImag(this.imag + right.getImag());
        return newComplex;
    }

}
