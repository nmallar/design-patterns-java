package PracticalFactorypattern1;

public class Client {
    public static void main(String[] args) {
        BirdType type=BirdType.CROW;

        BirdFactory bf=new BirdFactory();

        Bird bird=bf.createBirdFromType(type);
    }
}
