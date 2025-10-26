package main.java.bubbles;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;
        this.water = new SparklingWater("transparent", 0.9, "none", 20.0);

        // создаём пузырьки (10 тыс на литр)
        int bubblesCount = (int) (volume * 10000);
        Bubble[] bubbles = new Bubble[bubblesCount];
        for (int i = 0; i < bubblesCount; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        water.pump(bubbles);
    }

    public void open() {
        System.out.println("Bottle opened! Start degas...");
        water.degas();
        System.out.println("All gas is out!");
    }
}
