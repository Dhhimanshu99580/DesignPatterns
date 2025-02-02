package observerpattern;

public interface Publish {
    void addObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObserver(int droppedPrice);

}
