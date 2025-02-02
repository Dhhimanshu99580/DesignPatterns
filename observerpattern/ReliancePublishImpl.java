package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ReliancePublishImpl implements Publish {
    List<Observer>listOfObserver = new ArrayList<>();
    int droppedPrice;

    public void setDroppedPrice(int droppedPrice) {
        this.droppedPrice = droppedPrice;
        notifyObserver(droppedPrice);
    }

    public void addObserver(Observer obj) {
        listOfObserver.add(obj);
    }
    public void removeObserver(Observer obj) {
        listOfObserver.remove(obj);
    }
    public void notifyObserver(int droppedPrice) {
        for(Observer observer : listOfObserver) {
            observer.update(droppedPrice,observer);
        }
    }
}
