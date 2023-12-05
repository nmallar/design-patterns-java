package ObserverDesignPattern1;

public class Client {
    public static void main(String[] args) {
        Order order1=new Order(Long.valueOf("123"),"soap");
        Order order2=new Order(Long.valueOf("456"),"shampoo");

        Flipkart flipkart=new Flipkart();

        EmailSubscriber emailSubscriber=new EmailSubscriber(flipkart);
        SMSSubscriber subscriber=new SMSSubscriber(flipkart);

        flipkart.addOrder(order1);
        flipkart.addOrder(order2);
    }
}
