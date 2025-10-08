package project.bubbles;

public class Bubble {

    private double bubbleVolume = 0.3;
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public double getBubbleVolume() {
        return bubbleVolume;
    }

    public String getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burst() {
        System.out.println("Cramp!");
    }


}
