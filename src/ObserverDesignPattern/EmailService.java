package ObserverDesignPattern;

public class EmailService implements OrderPlacedSubscriber{


    EmailService(Flipkart flipkart){
        flipkart.addSubscriber(this);

    }
    @Override
    public void onOrderPlaced(Order order){
        sendmail(order.orderId);
    }
    public void sendmail(Long orderId){
        System.out.println("Email sent for order id : "+orderId);
    }
}
