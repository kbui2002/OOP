package lab7.shape;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width+length);
    }
    public String toString() {
        return "Rectangle["+super.toString()+", width = "+getWidth()+", length = "+getLength()+"]";
    }
}
