import java.util.List;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", "9780316769488", true));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", "Classic", "9780141439518", true));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", "9780547928227", true));
        library.addBook(new Book("The Hunger Games", "Suzanne Collins", "Young Adult", "9780439023481", true));


        //removing a book from library
        String isbnToRemove = "9780316769488";
        System.out.println("\nRemoving Book with ISBN: " + isbnToRemove);
        library.removeBook(isbnToRemove);

        // Displaying available books
        System.out.println("Available Books:");
        library.displayAvailableBooks();

        // Searching for a book
        String searchKey = "prejudice";
        List<Book> searchResult = library.searchBook(searchKey);
        System.out.println("\nSearch Results:");
        for (Book book : searchResult) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getGenre() + ") - ISBN: " + book.getIsbn());
        }

        // Checking out a book
        String isbnToCheckout = "9780547928227";
        library.checkoutBook(isbnToCheckout);

        // Displaying available books after checkout
        System.out.println("\nAvailable Books after Checkout:");
        library.displayAvailableBooks();

        // Returning a book
        String isbnToReturn = "9780141439518";
        library.returnBook(isbnToReturn);

        // Displaying available books after return
        System.out.println("\nAvailable Books after Return:");
        library.displayAvailableBooks();
    }
}
