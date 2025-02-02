package observerpattern;

public class Main {
    public static void main(String [] args) {
        ReliancePublishImpl publishobj = new ReliancePublishImpl();
        publishobj.addObserver(new PhoneObserverImpl());
        publishobj.addObserver(new DesktopObserverImpl());
        publishobj.setDroppedPrice(20);
    }
}
