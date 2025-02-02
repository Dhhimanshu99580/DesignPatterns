package observerpattern;

public class DesktopObserverImpl implements Observer {

    public void update(int price,Observer obj) {
        System.out.println("Update sent on Desktop, for a price drop of " + price + " Rupees");
    }
}
