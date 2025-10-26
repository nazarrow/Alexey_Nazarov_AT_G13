package main.java.playground.essence.craft;

public interface Rideable {
    void ride();

    String getName();

    default void drive(String direction) {
        System.out.printf("I am %s, my name is %s and I am driving to %s%n", getClass().getSimpleName(), getName(), direction);
    };
}
