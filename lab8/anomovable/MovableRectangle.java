package lab8.anomovable;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "Top Left(" + topLeft.getX() + ", " + topLeft.getY() + ") speed=(" + topLeft.getXSpeed() + ", "
                + topLeft.getYSpeed() + ")" + "; Bottom Right(" + bottomRight.getX() + ", " + bottomRight.getY()
                + ") speed=(" + bottomRight.getXSpeed() + ", " + bottomRight.getYSpeed() + ")";
    }

    public void moveUp() {
        topLeft.moveDown();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveUp();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveRight();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveLeft();
        bottomRight.moveRight();
    }
}
