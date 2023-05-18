package lab7.pointandlineclasses;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println(l2);
        System.out.println("Length " + l1 + ": " + l1.getLength());
        System.out.println("Gradient " + l2 + ": " + l2.getGradient());
    }
}
