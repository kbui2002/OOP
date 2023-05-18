package lab8.abstractshape;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false); //upcast
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        // System.out.println(shape1.getRadius()); bị che đi trong circle do kiểu dữ liệu là shape

        Circle circle1 = (Circle) shape1; //downcast
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        // Shape shape2 = new Shape();

        Shape shape3 = new Rectangle(1.0, 2.0, "red", false); //upcast  
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape3.getColor());
        // System.out.println(shape3.getLength());

        Rectangle rectangle1 = (Rectangle) shape3; //downcast
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Shape shape4 = new Square(6.6); //upcast
        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());

        Rectangle rectangle2 = (Rectangle) shape4;
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        System.out.println(rectangle2.getLength());

        Square square1 = (Square) rectangle2;
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());

        
    }
}