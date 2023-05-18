package lab8.geometricobjectinterface;

public class Main {
    public static void main(String[] args) {
        // circle
        Circle s1 = new Circle(5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.toString());
        // rectangle
        Rectangle r1 = new Rectangle(5.5, 6.0);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(s1.toString());
    }
}
