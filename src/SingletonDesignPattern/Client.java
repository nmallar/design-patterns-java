package SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection dbc=DatabaseConnection.getInstance();

        DatabaseConnection dbc2=DatabaseConnection.getInstance();

    }
}
