package solidexamplecode;

public class Book {
    String title,author,isbn;
    boolean avaialability;

    public Book(String title, String author, String isbn, boolean avaialability) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.avaialability = avaialability;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvaialability() {
        return avaialability;
    }

    public void setAvaialability(boolean avaialability) {
        this.avaialability = avaialability;
    }

    public boolean bookAdded() {
        //to be written
        return true;
    }
    public boolean BookRemoved() {
        // to be written
        return true;
    }
    public boolean bookUpdated() {
        // to be written
        return true;

    }

}
