package ObserverDesignPattern1;

public class SMSSubscriber implements Subscriber{
    Flipkart flipkart;

    public SMSSubscriber(Flipkart flipkart) {
        flipkart.addSubscriber(this);
    }


    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order);
        sendSMS(order);


    }

    private void sendSMS(Order order) {

        System.out.println("Order SMS sent for order id "+order.orderId);
    }

    private void generateInvoice(Order order) {

        System.out.println("Invoice generated for order id "+order.orderId);


    }
}
