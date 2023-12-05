package SingletonDesignPattern;

public class DatabaseConnection {

    private String url;
    private String username;

    private String password;
    private static DatabaseConnection instance;

    private DatabaseConnection() {        }

    public static DatabaseConnection getInstance(){
        if(instance==null){
            synchronized (DatabaseConnection.class){
                if(instance==null){
                    instance=new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
