import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    };

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        Point originPoint = new Point();
        int xA = getX();
        int yA = getY();
        int xB = originPoint.getX();
        int yB = originPoint.getY();

        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public double distance(int x, int y) {
        Point pointB = new Point(x, y);
        int xB = pointB.getX();
        int yB = pointB.getY();
        int xA = this.getX();
        int yA = this.getY();

        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));

    }

    public double distance(Point point) {
        int xA = getX();
        int yA = getY();
        int xB = point.getX();
        int yB = point.getY();
        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }
}