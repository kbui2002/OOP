package truutuong;

public class Test {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println(rec1);

        AbstractShape tri1 = new Triangle();
        System.out.println(tri1);
        
        AbstractShape newShape = new AbstractShape();

    }
}
