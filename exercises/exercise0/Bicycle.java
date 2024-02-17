package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Bicycle {
          private String brand;
      private String model;
      private int yearManufactured;
      private double price;
      private int tyreNumber;
      private int wheelSize;
      private int seatNumber;
      private String breaktype;

      public Bicycle(String brand, String model, int yearManufactured, double price, int tyreNumber, int wheelSize, int seatNumber, String breaktype) {
          this.brand = brand;
          this.model = model;
          this.yearManufactured = yearManufactured;
          this.price = price;
          this.tyreNumber = tyreNumber;
          this.wheelSize = wheelSize;
          this.seatNumber = seatNumber;
          this.breaktype = breaktype;
          System.out.println("bicycle instance created with brand: " + brand);
      }

      public void ride() {

          }
      public void jump() {
              System.out.println("bicycle can jump");
          }
      public void trun() {
              System.out.println("bicycle can make turns");
          }
  }


