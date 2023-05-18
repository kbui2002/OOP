package lab8.resizablegeometric;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
        super();
    }
    public ResizableCircle(double radius) {
        super(radius);
    }
    public String toString() {
        return "ResizableCircle(" + super.toString() + ")";
    }
    public void resize(int percent) {
        double newRadius = super.getRadius() * percent/100;
        super.setRadius(newRadius);
    }
}
