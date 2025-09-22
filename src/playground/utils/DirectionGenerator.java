package playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random random = new Random();
        int randomNumber = random.nextInt(40);

        if (randomNumber >= 1 && randomNumber <= 9) {
            return "NORTH";
        } else if (randomNumber >= 10 && randomNumber <= 19) {
            return "SOUTH";
        } else if (randomNumber >= 20 && randomNumber <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }

    }
}

