package decoratorpattern;
public abstract class NotificationDecorator implements Notification{
    protected Notification notification;
    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }
    public void sendNotification() {
        notification.sendNotification();
    }
}
