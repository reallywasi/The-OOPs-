public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }



    
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.publicationYear = other.publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        
        Book book1 = new Book("Mein Kamf", "Fuhrer", 1913);

        Book book2 = new Book(book1);
        System.out.println("Details of Book 1:");
        book1.displayDetails();
        System.out.println("\nDetails of Book 2 (Copy of Book 1):");
        book2.displayDetails();
    }
}
