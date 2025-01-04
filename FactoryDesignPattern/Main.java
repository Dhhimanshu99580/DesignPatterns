package FactoryDesignPattern;

public class Main {
    public  static void main(String [] args) {
        notification whatsapp = new WhatsappFactory().sendNotification();
        notification sms = new SmsFactory().sendNotification();
        whatsapp.notifi();
        sms.notifi();
    }
}
