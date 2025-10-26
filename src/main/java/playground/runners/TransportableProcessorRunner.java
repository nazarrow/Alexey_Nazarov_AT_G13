package main.java.playground.runners;

import main.java.playground.essence.Flyable;
import main.java.playground.essence.craft.Rideable;
import main.java.playground.essence.craft.Transportable;
import main.java.playground.essence.craft.air.Aircraft;
import main.java.playground.essence.craft.air.Copter;
import main.java.playground.essence.craft.air.Plane;
import main.java.playground.essence.craft.air.Rocket;
import main.java.playground.essence.craft.field.Car;
import main.java.playground.essence.craft.field.Moped;
import main.java.playground.essence.craft.field.Motorbike;
import main.java.playground.essence.craft.field.Vehicle;
import main.java.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {
    public static void main(String[] args) {
        TransportableProcessor transportableProcessor = new TransportableProcessor();

        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");

        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");

        Vehicle vehicleCar = new Car(23, "Tesla X Vehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Vehicle");

        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");

        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");

        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");

        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        transportableProcessor.runTransportable(transportableCopter);
        transportableProcessor.runTransportable(transportablePlane);
        transportableProcessor.runTransportable(transportableRocket);
        transportableProcessor.runTransportable(transportableCar);
        transportableProcessor.runTransportable(transportableMoped);
        transportableProcessor.runTransportable(transportableMotorbike);
        transportableProcessor.runTransportable(aircraftCopter);
        transportableProcessor.runTransportable(aircraftPlane);
        transportableProcessor.runTransportable(aircraftRocket);
        transportableProcessor.runTransportable(vehicleCar);
        transportableProcessor.runTransportable(vehicleMoped);
        transportableProcessor.runTransportable(vehicleMotorbike);

//        transportableProcessor.runTransportable(flyableCopter);
//        transportableProcessor.runTransportable(flyableCopter);
//        transportableProcessor.runTransportable(flyablePlane);
//        transportableProcessor.runTransportable(flyableRocket);
//        Метод runTransportable не реализует интерфейс Flyable напрямую

//        transportableProcessor.runTransportable(rideableCar);
//        transportableProcessor.runTransportable(rideableMoped);
//        transportableProcessor.runTransportable(rideableMotorbike);
//        Метод runTransportable не реализует интерфейс Rideable напрямую

        transportableProcessor.runTransportable(aCopter);
        transportableProcessor.runTransportable(aPlane);
        transportableProcessor.runTransportable(aRocket);
        transportableProcessor.runTransportable(aCar);
        transportableProcessor.runTransportable(aMoped);
        transportableProcessor.runTransportable(aMotorbike);

        transportableProcessor.runTransportable(aMoped, 23, 242);
        transportableProcessor.runTransportable(aMotorbike, 93, 7);
    }
}
