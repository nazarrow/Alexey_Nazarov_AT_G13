package project.bubbles;

public class Runner {
    public static void main(String[] args) {
        Bottle bottle05 = new Bottle(0.5);
        Bottle bottle1 = new Bottle(1.0);
        Bottle bottle15 = new Bottle(1.5);

        bottle05.open();
        bottle1.open();
        bottle15.open();
    }
}
