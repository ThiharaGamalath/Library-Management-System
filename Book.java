public class Book {
    private String title;
    private String  author;
    private String isbn;
    private boolean isAvailable;

    //Constructor
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
     //to display Book information
     public void displayBookInfo() {
        System.out.println("-----Book Information-----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println();
     }

     //Getter and Setter for availability
     public boolean isAvailable() {
        return isAvailable;
     }

     public void setAvailable(boolean available) {
        isAvailable = available;
     }

    public String getIsbn() {
        return isbn;
    }
}


