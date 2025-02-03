package decoratorpattern;

public class NotificationImpl implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending notification");
    }
}
