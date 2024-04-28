import java.io.Serializable;

import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] sArray = new Shape[5];
        sArray[0] = new Triangle("Red", 5, 6, 3, 4, 5);
        sArray[1] = new Rectangle("Blue", 4, 6);
        sArray[2] = new Circle("Green", 3);
        sArray[3] = new Square("Yellow", 5);


        serializeShapes(sArray);

        Shape[] deserializedArray = deserializeShapes();

        
        if (deserializedArray != null) {
            for (Shape shape : deserializedArray) {
                if (shape != null) {
                    System.out.println(shape.displayInfo());
                }
            }
        }

        System.out.println(Shape.displayStaticInfo());
    }

    private static void serializeShapes(Shape[] shapes) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("shapes.ser"))) {
            outputStream.writeObject(shapes);
            System.out.println("Shapes serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Shape[] deserializeShapes() {
        Shape[] shapes = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("shapes.ser"))) {
            shapes = (Shape[]) inputStream.readObject();
            System.out.println("Shapes deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shapes;
    }
}
