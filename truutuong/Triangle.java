package truutuong;

public class Triangle implements ShapeInterface {
    int base;
    int height;

    public Triangle() {
        super();
        base = 0;
        height = 0;
    }

    public Triangle(int base, int height) {
        super();
        this.base = base;
        this.height = height;

    }

    public Triangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;

    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return 1 / 2 * base * height;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Triangle{" + ";color" + color + ";base" + base + ";height" + height + "}";
    }

}
