package ObserverDesignPattern;

public class Client {

    public static void main(String[] args) {

        Flipkart flipkart= new Flipkart();
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator(flipkart);

        Order or=new Order(Long.valueOf("123"));
        flipkart.orderPlaced(or);

        Order or2=new Order(Long.valueOf("456"));
        EmailService email=new EmailService(flipkart);
        flipkart.orderPlaced(or2);



    }
}
