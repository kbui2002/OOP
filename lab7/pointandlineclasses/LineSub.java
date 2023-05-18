package lab7.pointandlineclasses;

public class LineSub extends Point {
    Point end;
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    public String toString() {
        return "LineSUB(Begin=" + super.toString() + ", End=" + end + ")";
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }
    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }
    public void setBeginX(int beginX) {
        super.setX(beginX);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public int getBeginY() {
        return getY();
    }
    public void setBeginY(int beginY) {
        super.setX(beginY);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public int[] getBeginXY() {
        return super.getXY();
    }
    public void setBeginXY(int beginX, int beginY) {
        super.setXY(beginX, beginY);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }
    public int getLength() {
        int xDiff = end.getX()-super.getX();
        int yDiff = end.getY()-super.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = end.getX()-super.getX();
        int yDiff = end.getY()-super.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
