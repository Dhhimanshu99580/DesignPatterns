package decoratorpattern;

public class EmailDecorator extends NotificationDecorator{
    public EmailDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println("via email");
    }
}
