package playground.essence.craft.air;

import playground.essence.Flyable;
import playground.essence.craft.Transportable;

import java.io.Serializable;

public class Copter extends Aircraft implements Flyable, Transportable, Serializable {
    public Copter(int mass, String name) {
        super(mass, name);
    }

    public Copter() {
        super();
    }
}
