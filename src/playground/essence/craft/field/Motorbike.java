package playground.essence.craft.field;

import playground.essence.craft.Rideable;
import playground.essence.craft.Transportable;

public class Motorbike extends Vehicle implements Transportable, Rideable {
    public Motorbike(int mass, String name) {
        super(mass, name);
    }
}
