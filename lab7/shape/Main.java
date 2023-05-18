package lab7.shape;

public class Main {
    public static void main(String[] args) {
        //circle
        Circle s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.toString());
        //rectangle
        Rectangle r1 = new Rectangle(5.5,6.0, "RED", true);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(s1.toString());
        //square
        Square sq1 = new Square(4.0, "RED", false);
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getPerimeter());
        System.out.println(s1.toString());
    }
}
