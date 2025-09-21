package playground.runners;

import playground.essence.Flyable;
import playground.essence.craft.air.Aircraft;
import playground.essence.craft.air.Copter;
import playground.essence.craft.air.Plane;
import playground.essence.craft.air.Rocket;
import playground.essence.creatures.Fly;
import playground.essence.creatures.Insect;
import playground.essence.creatures.Mosquito;
import playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor flyableProcessor = new FlyableProcessor();

        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        System.out.println(" ");

        flyableProcessor.runFlyable(flyableCopter);
        System.out.println(" ");
        flyableProcessor.runFlyable(flyablePlane);
        System.out.println(" ");
        flyableProcessor.runFlyable(flyableRocket);
        System.out.println(" ");
        flyableProcessor.runFlyable(flyableFly);
        System.out.println(" ");
        flyableProcessor.runFlyable(flyableMosquito);

        flyableProcessor.runFlyable(aircraftCopter);
        System.out.println(" ");
        flyableProcessor.runFlyable(aircraftPlane);
        System.out.println(" ");
        flyableProcessor.runFlyable(aircraftRocket);
        System.out.println(" ");

        // flyableProcessor.runFlyable(insectFly);
        // Insect — абстрактный класс, не реализует Flyable напрямую.

        // flyableProcessor.runFlyable(insectMosquito);
        // Insect — абстрактный класс, не реализует Flyable напрямую.

        flyableProcessor.runFlyable(aCopter);
        System.out.println(" ");
        flyableProcessor.runFlyable(aPlane);
        System.out.println(" ");
        flyableProcessor.runFlyable(aRocket);
        System.out.println(" ");
        flyableProcessor.runFlyable(aFly);
        System.out.println(" ");
        flyableProcessor.runFlyable(aMosquito);
        System.out.println(" ");

        flyableProcessor.runFlyable(flyablePlane, "никуда");
        System.out.println(" ");
        flyableProcessor.runFlyable(flyableMosquito, "повсюду");
        System.out.println(" ");
    }
}
