package main.java.playground.essence.creatures;

import main.java.playground.essence.Matter;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        String strFormat = String.format("I am %s and I am eating %s", this.name, food.getName());
        System.out.println(strFormat);
    }
}
