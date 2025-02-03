package decoratorpattern;

public class Main {
    public static void main(String [] args) {
        Notification notification = new NotificationImpl();
        notification = new SmsDecorator(notification);
        notification.sendNotification();

        Notification not = new NotificationImpl();
        not = new EmailDecorator(not);
        not.sendNotification();

        notification = new EmailDecorator(notification);
        notification.sendNotification();
    }
}
