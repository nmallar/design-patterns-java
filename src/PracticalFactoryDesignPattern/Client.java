package PracticalFactoryDesignPattern;

import PracticalFactoryDesignPattern.Birds.Bird;
import PracticalFactoryDesignPattern.Birds.BirdType;
import  PracticalFactoryDesignPattern.Birds.BirdFactory;

public class Client {

    public static void main(String[] args) {

        BirdType birdType;
        BirdFactory bf= new BirdFactory();
        birdType=BirdType.PEACOCK;
        Bird bird=bf.createBirdOfType(birdType);


    }
}
