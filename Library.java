import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    //Constructor
    public Library() {
        books = new ArrayList<>();
    }
    //add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    //view all books
    public void viewBooks(){
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }

    //Borrow a book
    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("You have succesfully borrowed the book");
                }else {
                     System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found with the provided ISBN.");
    }
     public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("You have successfully returned the book");
                }else {
                     System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found with the provided ISBN.");
    }
}
