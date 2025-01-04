package factorydesignpattern;

public abstract class NotificationFactory {
    abstract Notification sendNotification();

    public void printNotification() {
        System.out.println("printing notification in Factory method");
    }

}
