package thicuoiky.bai2;

public interface Poly {
    public int coefficient(int var);

    public int[] coefficient();

    public int degree();

    public Poly derivative();

    public double evaluate(double var);
}
