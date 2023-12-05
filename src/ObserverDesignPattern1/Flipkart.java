package ObserverDesignPattern1;

import java.util.ArrayList;
import java.util.List;

public class Flipkart implements Subject{

    List<Subscriber> subscribers= new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);

    }

    @Override
    public void notifySubscriber(Order order) {
        for (Subscriber subscriber:subscribers) {
            subscriber.onOrderPlaced(order);
        }

    }
    public void addOrder(Order order){
        notifySubscriber(order);
    }

}
