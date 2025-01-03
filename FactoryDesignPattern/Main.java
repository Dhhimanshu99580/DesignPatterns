package FactoryDesignPattern;

public class Main {
    public  static void main(String [] args) {
        notification whatsapp = new WhatsappFactory().sendNotification();
        whatsapp.notifi();
    }
}
