package project.bubbles;

public class SparklingWater extends Water {

    private Bubble[] bubbles;

    public SparklingWater(String color, double transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
    }

    public void pump(Bubble[] bubblesArray) {
        this.bubbles = bubblesArray;
    }

    public void degas() {
        if (bubbles == null) return;
        for (Bubble bubble : bubbles) {
            bubble.burst();
        }
        bubbles = null;
    }

}
