package Section_6_and_7_OOP.CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double height) {
        if (width < 0) this.width = 0;
        else this.width = width;
        if (height < 0) this.length = 0;
        else this.length = height;
    }

    public double getArea() {
        return this.width * this.length;
    }
}