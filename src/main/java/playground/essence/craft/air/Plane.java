package main.java.playground.essence.craft.air;

import main.java.playground.essence.Flyable;
import main.java.playground.essence.craft.Transportable;

public class Plane extends Aircraft implements Flyable, Transportable {
    public Plane(int mass, String name) {
        super(mass, name);
    }

}
