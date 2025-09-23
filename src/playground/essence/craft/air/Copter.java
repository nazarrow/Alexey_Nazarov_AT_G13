package playground.essence.craft.air;

import playground.essence.Flyable;
import playground.essence.craft.Transportable;

public class Copter extends Aircraft implements Flyable, Transportable {
    public Copter(int mass, String name) {
        super(mass, name);
    }

}
