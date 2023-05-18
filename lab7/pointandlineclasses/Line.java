package lab7.pointandlineclasses;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        setBegin(begin);
        setEnd(end);
    }
    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }
    public String toString() {
        return "Line(Begin=" + begin + ", End=" + end + ")";
    }

    public Point getBegin() {
        return begin;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int beginY) {
        begin.setX(beginY);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public int[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY(int beginX, int beginY) {
        begin.setXY(beginX, beginY);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }
    public int getLength() {
        int xDiff = end.getX()-begin.getX();
        int yDiff = end.getY()-begin.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double getGradient() {
        int xDiff = end.getX()-begin.getX();
        int yDiff = end.getY()-begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
