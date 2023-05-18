package lab8.anomovable;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String toString() {
        return "(" + center.getX() + ", " + center.getY() + ") speed=(" + center.getXSpeed() + ", " + center.getYSpeed() + ")" + ", radius=" + radius;
    }
    public void moveUp() {
        center.moveUp();
    }
    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}
