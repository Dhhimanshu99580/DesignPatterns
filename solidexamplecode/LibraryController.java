package solidexamplecode;

import java.sql.SQLOutput;
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
        switch (sc.nextInt()) {
            case 1: User user = new StaffUserImpl(123,995849,"Himanshu","himanshu99580@gmail.com");
        }
    }
}
