package main.java.playground.processors;

import main.java.playground.essence.craft.Rideable;
import main.java.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        rideable.drive(DirectionGenerator.generateDirection());
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
