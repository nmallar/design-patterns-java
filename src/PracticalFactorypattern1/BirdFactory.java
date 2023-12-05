package PracticalFactorypattern1;

import static PracticalFactorypattern1.BirdType.*;

public class BirdFactory {

    public Bird createBirdFromType(BirdType type){
        return switch (type) {
            case HEN -> new Hen();
            case SPARROW -> new Sparrow();
            case CROW -> new Crow();
            default -> new Bird();
        };

    }
}
