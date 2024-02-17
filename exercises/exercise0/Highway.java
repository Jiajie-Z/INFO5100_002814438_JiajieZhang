package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Highway {
          private String location;
      private double length;
      private String roadsurface;
      private int lightNumber;
      private int exitNumber;
      private int laneNumber;
      private String name;
      private int tollNumber;

      public Highway(String location, double length, String roadsurface, int lightNumber, int exitNumber, int laneNumber, String name, int tollNumber) {
          this.location = location;
          this.length = length;
          this.roadsurface = roadsurface;
          this.lightNumber = lightNumber;
          this.exitNumber = exitNumber;
          this.laneNumber = laneNumber;
          this.name = name;
          this.tollNumber = tollNumber;
          System.out.println("Highway instance created with name: " + name);}

      public void drive() {
              System.out.println("you can drive on highways");
          }
      public void stop() {
              System.out.println("you can stop on shoulder");
          }
      public void connect() {
              System.out.println("highway can connect places");
          }
  }


