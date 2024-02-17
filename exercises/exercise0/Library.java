package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Library {
      private String location;
      private String name;
      private int yearbuilt;
      private int capacity;
      private int areaCovered;
      private int booknumber;
      private int tablenumber;
      private String floortype;

      public Library(String string, String name, int yearbuilt, int capacity, int areaCovered, int booknumber, int tablenumber, String floortype ) {
          this.location = string;
          this.name = name;
          this.yearbuilt = yearbuilt;
          this.capacity = capacity;
          this.areaCovered = areaCovered;
          this.booknumber = booknumber;
          this.tablenumber = tablenumber;
          this.floortype = floortype;
          System.out.println("Library instance created with name: " + name);}

      public void store() {
              System.out.println("library can store books");
          }
      public void lend() {
              System.out.println("you can borrow books from library");
          }
      public void event() {
              System.out.println("library can hold events");
          }
  }

    
