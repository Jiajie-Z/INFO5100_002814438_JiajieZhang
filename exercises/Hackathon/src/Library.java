import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Library implements Serializable {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) {
        boolean removed = false;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book with ISBN " + isbn + " removed from the library.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ISBN " + isbn + " not found in the library.");
        }
    }

    public List<Book> searchBook(String searchKey) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchKey.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(searchKey.toLowerCase()) ||
                    book.getGenre().toLowerCase().contains(searchKey.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getGenre() + ") - ISBN: " + book.getIsbn());
            }
        }
    }

    public void checkoutBook(String isbn) {
        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                found = true;
                if (book.isAvailable()) {
                    book.setAvailability(false);
                    System.out.println("Book '" + book.getTitle() + "' checked out successfully.");
                } else {
                    System.out.println("Book '" + book.getTitle() + "' is currently unavailable for checkout.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found in the library.");
        }
    }

    public void returnBook(String isbn) {
        boolean found = false;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                found = true;
                if (!book.isAvailable()) {
                    book.setAvailability(true);
                    System.out.println("Book '" + book.getTitle() + "' returned successfully.");
                } else {
                    System.out.println("Book '" + book.getTitle() + "' is already available.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found in the library.");
        }
    }

    public void saveLibrary(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
            System.out.println("Library data saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Library loadLibrary(String filename) {
        Library library = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            library = (Library) ois.readObject();
            System.out.println("Library data loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return library;
    }
}

