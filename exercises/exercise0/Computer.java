package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Computer {
    
    private String brand;
    private String model;
    private int yearManufactured;
    private double price;
    private int portNumber;
    private int serialNumber;
    private String chargingport;
    private boolean touchscreen;

    public Computer(String brand, String model, int yearManufactured, double price, int portNumber,int serialNumber, String chargingport, boolean touchscreen) {
        this.brand = brand;
        this.model = model;
        this.yearManufactured = yearManufactured;
        this.price = price;
        this.portNumber = portNumber;
        this.serialNumber = serialNumber;
        this.chargingport = chargingport;
        this.touchscreen = touchscreen;
        System.out.println("Computer instance created with serial number: " + serialNumber);}

    public void listenMusic() {
            System.out.println("I can listen to some music.");
        }
    public void programing() {
            System.out.println("I can program with this computer");
        }
    public void playgames() {
            System.out.println("I can play games with this computer");
        }
    

   

    public class Screen{
        private String brand;
        private double size;
        private String shape;
        private int brightness;
        private String screenType;
        private double weight;
        private int contrast;
        private int transparency;


        public Screen(String brand, String model, int yearManufactured, double price, String shape,int serialNumber, String chargingport, boolean touchscreen) {
            this.brand = brand;
            this.size = size;
            this.shape = shape;
            this.brightness  = brightness;
            this.screenType = screenType;
            this.weight = weight;
            this.contrast = contrast;
            this.transparency = transparency;
        
            System.out.println("Screen instance created with serial number: " + serialNumber);}
    
        public Screen(String brand, String size, int yearManufactured, double price, String shape2, int serialNumber,
                int i, boolean touchscreen) {
            //TODO Auto-generated constructor stub
        }

        public void touch() {
                System.out.println("Screen can be touched");
            }
        public void crack() {
                System.out.println("I can crack this screen");
            }
        public void display() {
                System.out.println("Screen can display content I want");
            }
    }



    public class Keyboard{
        private int keynumber;
        private String color;
        private String backlight;
        private String language;
        private String keyshape;
        private String layout;
        private String connectingType;
        private String brand;

        public Keyboard(int keynumber, String color, String backlight, String language, String keyshape, String layout , String connectingType, String brand) {
            this.brand = brand;
            this.keynumber = keynumber;
            this.backlight = backlight;
            this.language = language;
            this.keyshape = keyshape;
            this.layout = layout;
            this.color = color;
            this.connectingType = connectingType;
            System.out.println("Keyboard instance created with brand: " + brand);}
    
        public void type() {
                System.out.println("Keyboard can type in things");
            }
        public void charge() {
                System.out.println("keyboard can be charged");
            }
        public void navigate() {
                System.out.println("keyboard can navigate");
            }
    }
}
