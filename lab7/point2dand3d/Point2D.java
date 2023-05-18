package lab7.point2dand3d;

public class Point2D {
    private float x;
    private float y;
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }
    public Point2D(float x, float y) {
        setX(x);
        setY(y);
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
