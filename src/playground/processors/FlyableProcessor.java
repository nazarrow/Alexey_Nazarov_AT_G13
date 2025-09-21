package playground.processors;

import playground.essence.Flyable;
import playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        String randomDir = DirectionGenerator.generateDirection();
        flyable.fly(randomDir);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }

}

