package main.java.playground.essence.craft.field;

import main.java.playground.essence.craft.Rideable;
import main.java.playground.essence.craft.Transportable;

public class Car extends Vehicle implements Transportable, Rideable {
    public Car(int mass, String name) {
        super(mass, name);
    }

    public void ride() {

    }

    @Override
    public void drive(String direction) {

    }
}
