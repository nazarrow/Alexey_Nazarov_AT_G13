package main.java.playground.essence.craft.air;

import main.java.playground.essence.Flyable;
import main.java.playground.essence.craft.Transportable;

import java.io.Serializable;

public class Copter extends Aircraft implements Flyable, Transportable, Serializable {
    public Copter(int mass, String name) {
        super(mass, name);
    }

    public Copter() {
        super();
    }
}
