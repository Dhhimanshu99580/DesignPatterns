package solidexamplecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LibraryController {
    public static void main(String args[]) {
        System.out.println("Please choose what do you want from the Below options...");
        System.out.println("To create a Student as user for Library,Type 1");
        System.out.println("To create a Staff as user for Library, Type 2");
        System.out.println("To Lend a Book from library, Type 3");
        System.out.println("To check a Book is available or not, Type 4");
        System.out.println("To add a book to Library, Type 5");
        Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        switch (sc.nextInt()) {
            case 1:
                    System.out.println("Enter the UTR,mobile,name,email..");
                    long utr = sc.nextLong();
                    long mob = sc.nextLong();
                    String name = sc.next();
                    String email = sc.next();
                    User user = new StudentUserImpl(utr,mob,name,email);
                    break;
            case 2:
                    System.out.println("Enter the UTR,mobile,name,email..");
                    System.out.println("Enter the UTR,mobile,name,email..");
                    utr = sc.nextLong();
                    mob = sc.nextLong();
                    name = sc.next();
                    email = sc.next();
                    User user1 = new StaffUserImpl(utr,mob,name,email);
                    break;
            case 3:
                    System.out.println("Enter the name of book you want to lend");
                    String bookName = sc.next();
                    break;

            case 4:

                    break;
            case 5:
                   System.out.println("Please Enter the details of the book you want to add: Title,Author" +
                           "ISBN,");
                   String title = sc.next();
                   String author = sc.next();
                   String isbn = sc.next();
                   Book book = new Book(title,author,isbn);
                   Map<String,Integer>map = book.bookAdded(title,book);
                   for(String key:map.keySet()) {
                       System.out.println(map.get(key));
                   }
                   break;
            default:
                System.out.println("Please select valid input");

        }
    }
}
