package decoratorpattern;

public class SmsDecorator extends NotificationDecorator{

    public SmsDecorator(decoratorpattern.Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
        System.out.println( " " + " via SMS");
    }
}
