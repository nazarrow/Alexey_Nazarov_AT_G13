package main.java.bubbles;

public abstract class Water {

    private String color;
    private double transparency;
    private String smell;
    private double temperature;

    public Water(String color, double transparency, String smell, double temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }
}
