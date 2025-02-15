package singleton;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello, Welcome to Singles.. community,, ");
        System.out.println("There are many other ways to implement singleton with respect to thread safety...");

        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.printNameofFruit();
    }
}
