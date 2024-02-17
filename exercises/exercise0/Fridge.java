package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Fridge {
          private String brand;
      private String model;
      private int yearManufactured;
      private double price;
      private int doorNumber;
      private int TDP;
      private int weight;
      private String color;

      public Fridge(String brand, String model, int yearManufactured, double price, int doorNumber, int TDP, int weight, String color) {
          this.brand = brand;
          this.model = model;
          this.yearManufactured = yearManufactured;
          this.price = price;
          this.doorNumber = doorNumber;
          this.TDP = TDP;
          this.weight = weight;
          this.color = color;
          System.out.println("fridge instance created with brand: " + brand);}

      public void store() {
              System.out.println("fridge can store things");
          }
      public void charge() {
              System.out.println("fridge needs plug to run");
          }
      public void freeze() {
              System.out.println("fridge can freeze things");
          }
  }


