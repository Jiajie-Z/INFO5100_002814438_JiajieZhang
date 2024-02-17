package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Car {
    private String brand;
    private String fuelType;
    private String body;
    private String color;
    private char vinnumber;
    private String model;
    private int displacement;
    private int height;

    public Car(String brand, String fuelType, int i, double d,
                            String string, int j, boolean b, String string2) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.body = body;
        this.color = color;
        this.vinnumber = vinnumber;
        this.model = model;
        this.displacement = displacement;
        this.height = height;
        System.out.println("Car instance created with VIN number: " + string);}

    public void drive() {
            System.out.println("I can drive this car.");
        }
    public void listenRadio() {
            System.out.println("I can listen to my favorite tune in my car");
        }
    public void openWindow() {
            System.out.println("Open the window and enjoy the summer breeze");
        }
}









