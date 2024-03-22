public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Red", 5, 6, 3, 4, 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        Circle circle = new Circle("Green", 3);
        Square square = new Square("Yellow", 5);

        System.out.println(triangle.displayInfo());
        System.out.println(rectangle.displayInfo());
        System.out.println(circle.displayInfo());
        System.out.println(square.displayInfo());

        System.out.println(Shape.displayStaticInfo());
    }
}