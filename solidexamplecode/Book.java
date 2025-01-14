package solidexamplecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    String title,author,isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Map<String,Integer> map = new HashMap<>();
    List<Book> bookList = new ArrayList<>();

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

    public List<Book> bookAdded(String title, Book book) {
        map.put(title,map.getOrDefault(title,0)+1);
        bookList.add(book);
        return bookList;
    }
    public boolean BookRemoved(String title) {
        map.put(title,map.get(title)-1);
        if(map.get(title)==0) {
            map.remove(title);
        }
        return true;
    }
    public boolean bookUpdated() {
        // to be written
        return true;

    }

}
