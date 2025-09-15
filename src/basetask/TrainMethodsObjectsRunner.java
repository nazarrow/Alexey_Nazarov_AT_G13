package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {

//        создать класс TrainMethodsObjectsRunner с методом main, в котором создать обьект класса TrainMethodsObjects,
//        и вызвать всего его методы

//        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

//        trainMethodsObjects.processMouse(new Mouse("Narushka", 77));

        new TrainMethodsObjects().processMouse(new Mouse("Narushka", 77));
        new TrainMethodsObjects().processSouce(new Souce("pikantnyi", "krasnogo"));
        new TrainMethodsObjects().processBee(new Bee("male", 100));
        new TrainMethodsObjects().processObstacle(new Obstacle("looooong descr", "hiiiigh"));
        new TrainMethodsObjects().processPineapple(new Pineapple("graaade", 2150.5));
    }
}
