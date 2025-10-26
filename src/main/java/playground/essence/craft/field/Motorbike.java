package main.java.playground.essence.craft.field;

import main.java.playground.essence.craft.Rideable;
import main.java.playground.essence.craft.Transportable;

public class Motorbike extends Vehicle implements Transportable, Rideable {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }

    public void ride() {

    }

    @Override
    public void drive(String direction) {

    }
}
