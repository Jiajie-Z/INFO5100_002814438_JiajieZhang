package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Phone {
        private String brand;
        private String model;
        private int yearManufactured;
        private double price;
        private double screensize;
        private int serialNumber;
        private String chargingport;
        private int numberofcamera;
    
        public Phone(String brand, String model, int yearManufactured, double price, double screensize, int serialNumber, String chargingport, int numberofcamera) {
            this.brand = brand;
            this.model = model;
            this.yearManufactured = yearManufactured;
            this.price = price;
            this.screensize = screensize;
            this.serialNumber = serialNumber;
            this.chargingport = chargingport;
            this.numberofcamera = numberofcamera;
            System.out.println("Phone instance created with brand: " + serialNumber);}
    
        public void call() {
                System.out.println("Phone can make calls");}
        public void text() {
                System.out.println("Phone can send texts");
            }
        public void takephoto() {
                System.out.println("Phone can take photos");
            }
    }

    
    

