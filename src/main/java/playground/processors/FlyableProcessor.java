package main.java.playground.processors;

import main.java.playground.essence.Flyable;
import main.java.playground.utils.DirectionGenerator;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable) {
        String randomDir = DirectionGenerator.generateDirection();
        flyable.fly(randomDir);
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }

}

