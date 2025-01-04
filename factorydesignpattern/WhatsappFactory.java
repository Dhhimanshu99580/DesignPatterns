package factorydesignpattern;

public class WhatsappFactory extends NotificationFactory {

    @Override
    public Notification sendNotification() {
        return new WhatsappNotificationImpl();
    }

}
