package lab8.resizablegeometric;

public class Main {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(4.0);
        System.out.println(circle);
        circle.resize(75);
        System.out.println("New: " + circle);
    }
}
