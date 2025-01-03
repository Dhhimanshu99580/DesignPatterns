package FactoryDesignPattern;

public abstract class notificationFactory {
    abstract notification sendNotification();

    public void printNotification() {
        System.out.println("printing notification in Factory method");
    }

}
