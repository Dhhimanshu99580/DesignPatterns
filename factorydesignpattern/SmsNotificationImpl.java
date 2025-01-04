package factorydesignpattern;

public class SmsNotificationImpl implements Notification {
    public void notifi() {
        System.out.println("Sending notification through SMS");
    }
}
