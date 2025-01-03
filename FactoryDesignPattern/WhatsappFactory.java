package FactoryDesignPattern;

public class WhatsappFactory extends notificationFactory{

    @Override
    public notification sendNotification() {
        return new WhatsappNotificationImpl();
    }

}
