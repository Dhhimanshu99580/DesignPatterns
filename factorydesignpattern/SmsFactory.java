package factorydesignpattern;

public class SmsFactory extends NotificationFactory {

    @Override
    public Notification sendNotification(){
        return new SmsNotificationImpl();
    }
}
