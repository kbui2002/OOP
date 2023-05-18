package truutuong;

public abstract class AbstractShape {
    String color;

    public AbstractShape() {
        color="red";
    }

    public AbstractShape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public String toString() {
        // TODO Auto-generated method stub
        return "Shape{" + ";color" + color + "}";
    }
}
