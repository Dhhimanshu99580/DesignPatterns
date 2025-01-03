package FactoryDesignPattern;

public class SmsFactory extends notificationFactory{

    @Override
    public notification sendNotification(){
        return new SmsNotificationImpl();
    }
}
