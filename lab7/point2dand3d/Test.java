package lab7.point2dand3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2d1 = new Point2D();
        System.out.println(point2d1.toString());
        Point2D point2d2 = new Point2D(3,5.1f);
        System.out.println(point2d2.toString());
        Point3D point3d1 = new Point3D();
        System.out.println(point3d1.toString());
        Point3D point3d2 = new Point3D(3,5,7.1f);
        System.out.println(point3d2.toString());
    }
}
