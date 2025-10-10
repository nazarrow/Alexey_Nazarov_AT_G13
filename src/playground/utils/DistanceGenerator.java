package playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        Random random = new Random();
        int dist = random.nextInt(99) + 1;
        System.out.printf("DistanceGenerator: I have generated distance with value: %d", dist);
        return dist;
    }
}
