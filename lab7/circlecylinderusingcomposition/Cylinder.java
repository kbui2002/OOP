package lab7.circlecylinderusingcomposition;

public class Cylinder {
    private Circle base;
    private double height;
    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }
    public Cylinder(double radius) {
        base = new Circle(radius);
        height = 1.0;
    }
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        setHeight(height);
    }
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        setHeight(height);
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return base.getArea()*getHeight();
    }
    @Override
    public String toString() {
        return "Circle [radius=" + base.getRadius() + " ,height= " + getHeight() + " ,color=" + base.getColor() +"]";
    }
}
