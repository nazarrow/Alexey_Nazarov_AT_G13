package main.java.playground.essence.craft.air;

import main.java.playground.essence.Flyable;
import main.java.playground.essence.craft.Transportable;

public class Rocket extends Aircraft implements Flyable, Transportable {
    public Rocket(int mass, String name) {
        super(mass, name);
    }

}
