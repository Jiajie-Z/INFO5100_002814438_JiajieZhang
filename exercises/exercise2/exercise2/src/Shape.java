import java.lang.Math;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String displayInfo() {
        return String.format("Shape: %s, Color: %s", this.getClass().getSimpleName(), color);
    }

    public static String displayStaticInfo() {
        return "This is a shape.";
    }
}