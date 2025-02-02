package observerpattern;

public class PhoneObserverImpl implements Observer{
    public void update(int droppedPrice, Observer obj) {
        System.out.println("Update sent on Phone, for a price drop of " + droppedPrice+ " Rupees");
    }

}
