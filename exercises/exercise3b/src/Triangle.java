import java.io.Serializable;
class Triangle extends Shape implements Serializable {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double base, double height, double side1, double side2, double side3) {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String displayInfo() {
        return String.format("%s, Area: %.2f, Perimeter: %.2f", super.displayInfo(), calculateArea(), calculatePerimeter());
    }
}