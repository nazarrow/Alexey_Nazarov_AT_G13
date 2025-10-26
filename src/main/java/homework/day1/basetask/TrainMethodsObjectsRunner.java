package main.java.homework.day1.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        new TrainMethodsObjects().processMouse(new Mouse("Narushka", 77));
        new TrainMethodsObjects().processSouce(new Souce("pikantnyi", "krasnogo"));
        new TrainMethodsObjects().processBee(new Bee("male", 100));
        new TrainMethodsObjects().processObstacle(new Obstacle("looooong descr", "hiiiigh"));
        new TrainMethodsObjects().processPineapple(new Pineapple("graaade", 2150.5));
    }
}
