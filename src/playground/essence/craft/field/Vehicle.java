package playground.essence.craft.field;

import playground.essence.Matter;
import playground.essence.craft.Rideable;
import playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d\n", this.getClass().getSimpleName(), getName(), pointA, pointB);
        return pointA - pointB;
    }
}
