package factorydesignpattern;

public class Main {
    public  static void main(String [] args) {
        Notification whatsapp = new WhatsappFactory().sendNotification();
        Notification sms = new SmsFactory().sendNotification();
        whatsapp.notifi();
        sms.notifi();
    }
}
