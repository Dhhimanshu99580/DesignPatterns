package solidexamplecode;

public interface User {
    public boolean isEligible();
    public void addUser(User user);
    public void addBooksForTheUser(Book book);
    public void removeBooksForTheUser();
}
