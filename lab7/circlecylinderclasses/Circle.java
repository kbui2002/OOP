package lab7.circlecylinderclasses;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius) {
        setRadius(radius);
        color = "red";
    }
    public Circle(double radius, String color) {
        setRadius(radius);
        setColor(color);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public String toString() {
        return "Circle [radius=" + radius + " ,color=" + color +"]";
    }
}
