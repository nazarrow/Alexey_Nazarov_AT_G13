package playground.essence.craft.air;

import playground.essence.Flyable;
import playground.essence.Matter;
import playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public Aircraft() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s\n", this.getClass().getSimpleName(), getName(), direction);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d\n", this.getClass().getSimpleName(), getName(), pointA, pointB);
        return pointA - pointB;
    }

}
