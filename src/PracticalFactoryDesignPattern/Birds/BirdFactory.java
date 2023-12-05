package PracticalFactoryDesignPattern.Birds;

public class BirdFactory {

    public Bird createBirdOfType(BirdType birdType){
        return switch(birdType) {
            case HEN-> new Hen();
            case PEACOCK -> new Peacock();
            case CROW -> new Crow();
            case SPARROW -> new Sparrow();
            default -> new Bird();
        };
    }
    public Bird createBirdFromStringType(String str){
       if(str.equalsIgnoreCase("HEN")){
           return new Hen();
       }
       else if (str.equalsIgnoreCase("CROW")){
           return new Crow();
       } else if (str.equalsIgnoreCase("PEACOCK")) {
           return new Peacock();

       } else if (str.equalsIgnoreCase("SPARROW")) {
           return new Sparrow();

       }
    return null;
    }
}
