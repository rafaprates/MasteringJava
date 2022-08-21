package Section_6_and_7_OOP.PoolArea;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double height, double length) {
        super(width, height);
        if (length < 0) this.height = 0;
        else this.height = length;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
