package INFO5100_002814438_JiajieZhang.exercises.exercise0;

import org.w3c.dom.traversal.TreeWalker;

import INFO5100_002814438_JiajieZhang.exercises.exercise0.Computer.Keyboard;
import INFO5100_002814438_JiajieZhang.exercises.exercise0.Computer.Screen;

public class Demo {
        public static void main (String[] args){ 
            Car car1 = new Car("Toyota", "Camry", 2023, 15000.00,
            "white", 15000, false, "gasoline");
            Car car2 = new Car("BMW", "Camry", 2020, 24999.99,
            "Silver", 15000, false, "Gasoline");
            Car car3 = new Car("LEXUS", "Camry", 2022, 24999.99,
            "Silver", 15000, false, "Gasoline");     

            Computer computer1 = new Computer("Dell", "xps", 2020, 1000, 3, 23232, "usb-c", false);
            Computer computer3 = new Computer("HP", "qqq", 2020, 1000, 3, 23232, "usb-c", false);
            Computer computer2 = new Computer("alienware", "x17", 2020, 1000, 3, 23232, "usb-c", false);

            Book book1 = new Book(12, 13, 15, "Jason", 12143134, 2023, 14.99, 456);
            Book book2 = new Book(12, 43, 15, "Joe", 78131, 2023, 17.99, 726);
            Book book3 = new Book(12, 53, 25, "John", 45234, 2023, 18.99, 216);

            Phone phone1 = new Phone("apple", "14pro", 2023, 999.99, 5.15, 389576524, "lightening", 2);
            Phone phone2 = new Phone("apple", "13pro", 2022, 999.99, 5.15, 357656524, "lightening", 2);
            Phone phone3 = new Phone("apple", "12pro", 2021, 999.99, 5.15, 389576764, "lightening",3);

            Library library1 = new Library("Los Gatos", "Los gatos city library", 2010, 100, 10000, 5000, 40, "two floors");
            Library library2 = new Library("cupertino", "Cupertino city library", 2000, 100, 10000, 5000, 40, "two floors");
            Library library3 = new Library("San jose", "San jose city library", 2013, 100, 10000, 5000, 40, "two floors");

            Highway highway1 = new Highway("San jose", 1000, "tarmac", 1000, 200, 8, "101", 0);
            Highway highway2 = new Highway("San jose", 1000, "tarmac", 1000, 200, 8, "101", 0);
            Highway highway3 = new Highway("San jose", 1000, "tarmac", 1000, 200, 8, "101", 0);

            Fridge fridge1 = new Fridge("samsung", "x1", 2023, 999.99, 3, 200, 200, "white");
            Fridge fridge2 = new Fridge("LG", "g1", 2023, 999.99, 4, 200, 200, "white");
            Fridge fridge3 = new Fridge("samsung", "x5", 2023, 999.99, 4, 200, 200, "silver");

            Bicycle bicycle1 = new Bicycle("Trek", "x9", 2020, 999.99, 2, 38, 1, "disk break");
            Bicycle bicycle2 = new Bicycle("Giant", "p9", 2022, 999.99, 2, 26, 1, "disk break");
            Bicycle bicycle3 = new Bicycle("Trek", "h9", 2017, 1999.99, 2, 28, 1, "disk break");

            Cat cat1 = new Cat("alex", "male", 2018, 40, "Siamese cat", 4, 10, "white");
            Cat cat2 = new Cat("Jack", "male", 2017, 19, "Ragdoll", 4, 8, "white");
            Cat cat3 = new Cat("lily", "female", 2008, 26, "Maine", 4, 10, "grey");

            GameConsole gameConsole1 = new GameConsole("Sony", "ps5", 2023, 468.00, 3, 234134, 3, "white");
            GameConsole gameConsole2 = new GameConsole("microsoft", "xboxs", 2023, 498.00, 3, 234634, 3, "black");
            GameConsole gameConsole3 = new GameConsole("Sony", "ps4", 2017, 468.00, 3, 987134, 3, "white");

            Screen screen1 = computer1.new Screen("Samsung", "l5", 2022, 988.99, "square", 87245, 1, false);
            Screen screen2 = computer2.new Screen("Samsung", "h5", 2016, 935.99, "square", 51245, 1, false);
            Screen screen3 = computer3.new Screen("Samsung", "s5", 2012, 288.99, "square", 82645, 1, false);

            Keyboard keyboard1 = computer1.new Keyboard(104, "black", "rgb", "english", "square", "qwerty", "wired", "logitech");
            Keyboard keyboard2 = computer2.new Keyboard(67, "white", "rgb", "french", "circle", "qwerty", "wireless","steelseries");
            Keyboard keyboard3 = computer3.new Keyboard(87, "black", "none", "english ", "square", "qwerty", "wireless", "logitech");
    }
}

