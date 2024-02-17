package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Cat {
          private String name;
      private String gender;
      private int yearborn;
      private double weight;
      private String breed;
      private int clawNumber;
      private double tailLength;
      private String color;

      public Cat(String name, String gender, int yearborn, double weight, String breed, int clawNumber, double tailLength, String color) {
          this.name = name;
          this.gender = gender;
          this.yearborn = yearborn;
          this.weight = weight;
          this.breed = breed;
          this.clawNumber = clawNumber;
          this.tailLength = tailLength;
          this.color = color;
          System.out.println("cat instance created with breed: " + breed);}

      public void eat() {
              System.out.println("cat can eat");
          }
      public void drink() {
              System.out.println("cat can be drink");
          }
      public void run() {
              System.out.println("cat can run");
          }
  }


