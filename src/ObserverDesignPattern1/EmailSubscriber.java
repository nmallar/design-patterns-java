package ObserverDesignPattern1;

public class EmailSubscriber implements Subscriber{

    Flipkart flipkart;

    public EmailSubscriber(Flipkart flipkart) {
        this.flipkart = flipkart;
        flipkart.addSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order);
        sendEmail(order);

    }

    private void sendEmail(Order order) {
        System.out.println("Order email sent for order id "+order.orderId);
    }

    private void generateInvoice(Order order) {

        System.out.println("Invoice generated for order id "+order.orderId);


    }
}
