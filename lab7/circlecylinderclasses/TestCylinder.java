package lab7.circlecylinderclasses;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder: " + cylinder1.toString());
        System.out.println("Cylinder Area: " + cylinder1.getArea());
        System.out.println("Cylinder Volume: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder: " + cylinder2.toString());
        System.out.println("Cylinder Area: " + cylinder2.getArea());
        System.out.println("Cylinder Volume: " + cylinder2.getVolume());

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder: " + cylinder3.toString());
        System.out.println("Cylinder Area: " + cylinder3.getArea());
        System.out.println("Cylinder Volume: " + cylinder3.getVolume());
    }
}
