public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        String keyword = "programming";
        String bookTitle = "Java Programming";
        String memberName = "Jane Doe";
        librarySystem.borrowBook(keyword, bookTitle, memberName);
    }
}