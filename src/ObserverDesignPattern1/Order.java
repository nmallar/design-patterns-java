package ObserverDesignPattern1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Order {

    Long orderId;
    String item;

    public Order(Long orderId, String item) {
        this.orderId = orderId;
        this.item = item;
    }
}
