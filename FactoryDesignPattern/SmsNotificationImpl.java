package FactoryDesignPattern;

public class SmsNotificationImpl implements notification{
    public void notifi() {
        System.out.println("Sending notification through SMS");
    }
}
