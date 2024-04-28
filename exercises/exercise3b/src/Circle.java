import java.io.Serializable;
class Circle extends Shape implements Serializable {
    private final double PI = Math.PI;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String displayInfo() {
        return String.format("%s, Area: %.2f, Circumference: %.2f", super.displayInfo(), calculateArea(), calculatePerimeter());
    }
}