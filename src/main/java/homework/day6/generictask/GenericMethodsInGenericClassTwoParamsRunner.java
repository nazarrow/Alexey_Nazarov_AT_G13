package main.java.homework.day6.generictask;

import main.java.playground.essence.craft.air.Copter;
import main.java.playground.essence.craft.air.Plane;
import main.java.playground.essence.craft.air.Rocket;
import main.java.playground.essence.craft.field.Car;
import main.java.playground.essence.craft.field.Moped;
import main.java.playground.essence.craft.field.Motorbike;
import main.java.playground.essence.craft.hand.Bottle;
import main.java.playground.essence.craft.hand.Can;
import main.java.playground.essence.craft.hand.Mug;
import main.java.playground.essence.creatures.*;
import main.java.playground.essence.material.Diesel;
import main.java.playground.essence.material.Petrol;
import main.java.playground.essence.material.Water;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> strGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(strGen.genericMethodGenArgs("str1", "str2"));
        System.out.println(strGen.genericMethodGenArgs("jhsdjfj,sdhf"));
        strGen.genericMethodHalfGenArgs(24, "werwefsdfv wdf wef wvd ");
        strGen.genericMethodHalfGenArgs(23, "adafadf", " ojdfjsdjf df ");

        GenericMethodsInGenericClassTwoParams<String, Integer> strIntGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(strIntGen.genericMethodGenArgs("str1", 234));
        System.out.println(strIntGen.genericMethodGenArgs("jhsdjfj,sdhf"));
        strIntGen.genericMethodHalfGenArgs(24, "werwefsdfv wdf wef wvd ");
        strIntGen.genericMethodHalfGenArgs(23, "adafadf", " ojdfjsdjf df ");

        GenericMethodsInGenericClassTwoParams<String, Double> strDoubGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(strDoubGen.genericMethodGenArgs("str1", 234.234));
        System.out.println(strDoubGen.genericMethodGenArgs("jhsdjfj,sdhf"));
        strDoubGen.genericMethodHalfGenArgs(24.234, "werwefsdfv wdf wef wvd ");
        strDoubGen.genericMethodHalfGenArgs(23, "adafadf", " ojdfjsdjf df ");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> intIntGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(intIntGen.genericMethodGenArgs(23423, 234));
        System.out.println(intIntGen.genericMethodGenArgs(9780));
        intIntGen.genericMethodHalfGenArgs(24, "werwefsdfv wdf wef wvd ");
        intIntGen.genericMethodHalfGenArgs(23, "adafadf", " ojdfjsdjf df ");

        GenericMethodsInGenericClassTwoParams<Copter, Plane> copterPlaneGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(copterPlaneGen.genericMethodGenArgs(new Copter(2000, "copter"), new Plane(5000, "plane")));
        System.out.println(copterPlaneGen.genericMethodGenArgs(new Copter(20004, "ksjdf")));
        copterPlaneGen.genericMethodHalfGenArgs(new Copter(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        copterPlaneGen.genericMethodHalfGenArgs(new Copter(2345, "jnsbf sf b"), new Plane(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Copter, Rocket> copterRocketGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(copterRocketGen.genericMethodGenArgs(new Copter(2000, "copter"), new Rocket(5000, "plane")));
        System.out.println(copterRocketGen.genericMethodGenArgs(new Copter(20004, "ksjdf")));
        copterRocketGen.genericMethodHalfGenArgs(new Copter(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        copterRocketGen.genericMethodHalfGenArgs(new Copter(2345, "jnsbf sf b"), new Rocket(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Car, Moped> carMopedGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(carMopedGen.genericMethodGenArgs(new Car(2000, "copter"), new Moped(5000, "plane")));
        System.out.println(carMopedGen.genericMethodGenArgs(new Car(20004, "ksjdf")));
        carMopedGen.genericMethodHalfGenArgs(new Car(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        carMopedGen.genericMethodHalfGenArgs(new Car(2345, "jnsbf sf b"), new Moped(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Motorbike, Moped> motorbikeMopedGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(motorbikeMopedGen.genericMethodGenArgs(new Motorbike(2000, "copter"), new Moped(5000, "plane")));
        System.out.println(motorbikeMopedGen.genericMethodGenArgs(new Motorbike(20004, "ksjdf")));
        motorbikeMopedGen.genericMethodHalfGenArgs(new Motorbike(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        motorbikeMopedGen.genericMethodHalfGenArgs(new Motorbike(2345, "jnsbf sf b"), new Moped(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Bottle, Can> bottleCanGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(bottleCanGen.genericMethodGenArgs(new Bottle(2000, "copter"), new Can(5000, "plane")));
        System.out.println(bottleCanGen.genericMethodGenArgs(new Bottle(20004, "ksjdf")));
        bottleCanGen.genericMethodHalfGenArgs(new Bottle(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        bottleCanGen.genericMethodHalfGenArgs(new Bottle(2345, "jnsbf sf b"), new Can(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Mug, Can> mugCanGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(mugCanGen.genericMethodGenArgs(new Mug(2000, "copter"), new Can(5000, "plane")));
        System.out.println(mugCanGen.genericMethodGenArgs(new Mug(20004, "ksjdf")));
        mugCanGen.genericMethodHalfGenArgs(new Mug(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        mugCanGen.genericMethodHalfGenArgs(new Mug(2345, "jnsbf sf b"), new Can(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Beetle, Carrot> beetleCarrotGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(beetleCarrotGen.genericMethodGenArgs(new Beetle(2000, "copter"), new Carrot(5000, "plane")));
        System.out.println(beetleCarrotGen.genericMethodGenArgs(new Beetle(20004, "ksjdf")));
        beetleCarrotGen.genericMethodHalfGenArgs(new Beetle(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        beetleCarrotGen.genericMethodHalfGenArgs(new Beetle(2345, "jnsbf sf b"), new Carrot(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Chamomile, Crocodile> chamomileCrocodileGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(chamomileCrocodileGen.genericMethodGenArgs(new Chamomile(2000, "copter"), new Crocodile(5000, "plane")));
        System.out.println(chamomileCrocodileGen.genericMethodGenArgs(new Chamomile(20004, "ksjdf")));
        chamomileCrocodileGen.genericMethodHalfGenArgs(new Chamomile(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        chamomileCrocodileGen.genericMethodHalfGenArgs(new Chamomile(2345, "jnsbf sf b"), new Crocodile(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Fly, Maylily> flyMaylilyGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(flyMaylilyGen.genericMethodGenArgs(new Fly(2000, "copter"), new Maylily(5000, "plane")));
        System.out.println(flyMaylilyGen.genericMethodGenArgs(new Fly(20004, "ksjdf")));
        flyMaylilyGen.genericMethodHalfGenArgs(new Fly(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        flyMaylilyGen.genericMethodHalfGenArgs(new Fly(2345, "jnsbf sf b"), new Maylily(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Mosquito, Pigeon> mosquitoPigeonGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(mosquitoPigeonGen.genericMethodGenArgs(new Mosquito(2000, "copter"), new Pigeon(5000, "plane")));
        System.out.println(mosquitoPigeonGen.genericMethodGenArgs(new Mosquito(20004, "ksjdf")));
        mosquitoPigeonGen.genericMethodHalfGenArgs(new Mosquito(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        mosquitoPigeonGen.genericMethodHalfGenArgs(new Mosquito(2345, "jnsbf sf b"), new Pigeon(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Radish, Potato> radishPotatoGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(radishPotatoGen.genericMethodGenArgs(new Radish(2000, "copter"), new Potato(5000, "plane")));
        System.out.println(radishPotatoGen.genericMethodGenArgs(new Radish(20004, "ksjdf")));
        radishPotatoGen.genericMethodHalfGenArgs(new Radish(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        radishPotatoGen.genericMethodHalfGenArgs(new Radish(2345, "jnsbf sf b"), new Potato(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Raven, Rose> ravenRoseGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(ravenRoseGen.genericMethodGenArgs(new Raven(2000, "copter"), new Rose(5000, "plane")));
        System.out.println(ravenRoseGen.genericMethodGenArgs(new Raven(20004, "ksjdf")));
        ravenRoseGen.genericMethodHalfGenArgs(new Raven(234, "sjdhgfjshdf"), "usdfh sdfi uh");
        ravenRoseGen.genericMethodHalfGenArgs(new Raven(2345, "jnsbf sf b"), new Rose(8737, "gsdhfg iasfd"), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Diesel, Petrol> dieselPetrolGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(dieselPetrolGen.genericMethodGenArgs(new Diesel(2000), "rthfdggv rgs "));
        System.out.println(dieselPetrolGen.genericMethodGenArgs(new Diesel(20004)));
        dieselPetrolGen.genericMethodHalfGenArgs(new Diesel(234), "usdfh sdfi uh");
        dieselPetrolGen.genericMethodHalfGenArgs(new Diesel(2345), new Petrol(8737), " ojdfjsdjf df sdf 2523 ");

        GenericMethodsInGenericClassTwoParams<Water, Petrol> waterPetrolGen = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(waterPetrolGen.genericMethodGenArgs(new Water(2000), "rthfdggv rgs "));
        System.out.println(waterPetrolGen.genericMethodGenArgs(new Water(20004)));
        waterPetrolGen.genericMethodHalfGenArgs(new Water(234), "usdfh sdfi uh");
        waterPetrolGen.genericMethodHalfGenArgs(new Water(2345), new Petrol(8737), " ojdfjsdjf df sdf 2523 ");

    }
}
