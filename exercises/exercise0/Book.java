package INFO5100_002814438_JiajieZhang.exercises.exercise0;

public class Book{
    private double height;
    private double width;
    private double weight;
    private String author;
    private int isbnNumber;
    private int yearPublished;
    private double price;
    private int numberofpage;

    public Book(double height, double width, double weight, String author, int isbnNumber, int yearPublished, double price, int numberofpage)  {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.yearPublished = yearPublished;
        this.price = price;
        this.numberofpage = numberofpage;
        System.out.println("Book instance created with ISBN number: " + isbnNumber);}

    public void read() {
            System.out.println("Screen can be read");
        }
    public void tear() {
            System.out.println("Screen can be tear");
        }
    public void noted() {
            System.out.println("we can put notes on it");
        }
    }
