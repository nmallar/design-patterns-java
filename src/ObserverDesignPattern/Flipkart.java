package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;
public class Flipkart {
    public List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();


    public void addSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void removeSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaced(Order order){
        for (OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscribers){
            orderPlacedSubscriber.onOrderPlaced(order);
        }
    }
}
