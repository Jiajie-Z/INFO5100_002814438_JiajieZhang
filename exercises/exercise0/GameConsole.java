package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class GameConsole {
          private String brand;
      private String model;
      private int yearManufactured;
      private double price;
      private int portNumber;
      private int serialNumber;
      private String chargingport;
      private String color;

      public GameConsole(String brand, String model, int yearManufactured, double price, int portNumber, int serialNumber, String chargingport, String color) {
          this.brand = brand;
          this.model = model;
          this.yearManufactured = yearManufactured;
          this.price = price;
          this.portNumber = portNumber;
          this.serialNumber = serialNumber;
          this.color = color;
          this.chargingport = chargingport;
          System.out.println("gameConsole instance created with brand and model: " + brand +" "+ model);}

      public GameConsole(String brand2, String model2, int yearManufactured2, double price2, int portNumber2,
            int serialNumber2, int i, String color2) {
        //TODO Auto-generated constructor stub
    }

    public void play() {
              System.out.println("you can play games with it");
          }
      public void charge() {
              System.out.println("keyboard can be charged");
          }
      public void download() {
              System.out.println("you can download games in game console");
          }
  }

