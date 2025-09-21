package playground.essence.craft.field;

import playground.essence.craft.Rideable;
import playground.essence.craft.Transportable;

public class Car extends Vehicle implements Transportable, Rideable {
    public Car(int mass, String name) {
        super(mass, name);
    }
}
