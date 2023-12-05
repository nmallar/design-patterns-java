package SingletonDesignPattern1;

import lombok.ToString;

@ToString

public class Database {

    private static Database singletonInstance;

    private Database(){
    }

    public static Database getSingletonInstance(){
        if (singletonInstance==null){
            synchronized (Database.class)
            {
                if (singletonInstance==null)
                    singletonInstance=new Database();
            }
        }
        return singletonInstance;
    }
}
