package truutuong;

public class Shape {
    String color;

    public Shape() {
        color = "red";
    }

    public Shape(String color) {
        this.color = color;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }

    // getter
    public String getColor() {
        return color;
    }

    public double getArea() {
        System.out.println("shape unknown");
        return 0;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Shape{" + ";color" + color + "}";
    }
}