package truutuong;

public class Rectangle extends AbstractShape {
    double width;
    double length;

    public Rectangle() {
        super();
        width = 0.0;
        length = 0.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;

    }

    public Rectangle(double width, double length, String color) {
        
        super(color);
        this.width = width;
        this.length = length;

    }

    public void setHeight(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width*length;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Rectangle{" + ";color" + color + ";width" + width + ";length" + length + "}";
    }
}
