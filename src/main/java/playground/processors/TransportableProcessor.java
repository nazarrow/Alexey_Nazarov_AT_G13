package main.java.playground.processors;

import main.java.playground.essence.craft.Transportable;
import main.java.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int movedA = CoordinatesGenerator.generateCoordinate();
        int movedB = CoordinatesGenerator.generateCoordinate();
        transportable.move(movedA, movedB);
        int resultDivision = movedA - movedB;
        System.out.printf("Transportable %s was moved to %d points\n", this.getClass().getSimpleName(), resultDivision);
    }

    public void runTransportable(Transportable transportable) {
        int callRandNumb = CoordinatesGenerator.generateCoordinate();
        int callRandNumb1 = CoordinatesGenerator.generateCoordinate();
        transportable.move(callRandNumb, callRandNumb1);
        int resDivision = callRandNumb - callRandNumb1;
        System.out.printf("Transportable %s was moved to %d points\n", this.getClass().getSimpleName(), resDivision);
    }
}
