package ObserverDesignPattern1;

public interface Subject {

    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscriber(Order order);
}
