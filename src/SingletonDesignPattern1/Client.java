package SingletonDesignPattern1;

public class Client {

    public static void main(String[] args) {

        Database db1=Database.getSingletonInstance();

        Database db2=Database.getSingletonInstance();
        System.out.println( db1.hashCode());
       ;
        System.out.println(db2.hashCode());

    }



}
