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

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> stringGen = new GenericMethodsInGenericClassT<>();
        stringGen.genericMethodOneGenArg("text one gen arg");
        stringGen.genericMethodTwoGenArgs("1 arg two gen args", "2 arg two gen args");
        stringGen.genericMethodHalfGenArgs("3 arg half gen args", "strArg half gen args");

        GenericMethodsInGenericClassT<Integer> integerGen = new GenericMethodsInGenericClassT<>();
        integerGen.genericMethodOneGenArg(14);
        integerGen.genericMethodTwoGenArgs(16, 567);
        integerGen.genericMethodHalfGenArgs(235345, "integer half gen args");

        GenericMethodsInGenericClassT<Double> doubleGen = new GenericMethodsInGenericClassT<>();
        doubleGen.genericMethodOneGenArg(22.1);
        doubleGen.genericMethodTwoGenArgs(232455.345, 3345345.4);
        doubleGen.genericMethodHalfGenArgs(3462.346345, "double test");

        GenericMethodsInGenericClassT<Copter> copterGen = new GenericMethodsInGenericClassT<>();
        copterGen.genericMethodOneGenArg(new Copter(10, "Copter NN-170"));
        copterGen.genericMethodTwoGenArgs(new Copter(100, "BB-skdjf"), 23.4);
        copterGen.genericMethodHalfGenArgs(new Copter(45, "sdfsd"), "sdfsd");

        GenericMethodsInGenericClassT<Plane> planeGen = new GenericMethodsInGenericClassT<>();
        planeGen.genericMethodOneGenArg(new Plane(4587, "boing 747"));
        planeGen.genericMethodTwoGenArgs(new Plane(23423, "bbop"), 123);
        planeGen.genericMethodHalfGenArgs(new Plane(234, "sdfsdf"), "ksgadsn");

        GenericMethodsInGenericClassT<Rocket> rocketGen = new GenericMethodsInGenericClassT<>();
        rocketGen.genericMethodOneGenArg(new Rocket(4587, "rocket ZVM-2025"));
        rocketGen.genericMethodTwoGenArgs(new Rocket(23423, "bbop"), 123);
        rocketGen.genericMethodHalfGenArgs(new Rocket(234, "sdfsdf"), "ksgadsn");

        GenericMethodsInGenericClassT<Car> carGen = new GenericMethodsInGenericClassT<>();
        carGen.genericMethodOneGenArg(new Car(10, "Caaarrr"));
        carGen.genericMethodTwoGenArgs(new Car(100, "BB-skdjf"), 23.4);
        carGen.genericMethodHalfGenArgs(new Car(45, "sdfsd"), "sdfsd");

        GenericMethodsInGenericClassT<Moped> mopedGen = new GenericMethodsInGenericClassT<>();
        mopedGen.genericMethodOneGenArg(new Moped(10, "Moooped"));
        mopedGen.genericMethodTwoGenArgs(new Moped(100, "BB-skdjf"), 23.4);
        mopedGen.genericMethodHalfGenArgs(new Moped(45, "sdfsd"), "sdfsd");

        GenericMethodsInGenericClassT<Motorbike> motorbikeGen = new GenericMethodsInGenericClassT<>();
        motorbikeGen.genericMethodOneGenArg(new Motorbike(10, "Caaarrr"));
        motorbikeGen.genericMethodTwoGenArgs(new Motorbike(100, "BB-skdjf"), 23.4);
        motorbikeGen.genericMethodHalfGenArgs(new Motorbike(45, "sdfsd"), "sdfsd");

        GenericMethodsInGenericClassT<Bottle> bottleGen = new GenericMethodsInGenericClassT<>();
        bottleGen.genericMethodOneGenArg(new Bottle(10, "Cbootle"));
        bottleGen.genericMethodTwoGenArgs(new Bottle(100, "BB-skdjf"), 23.4);
        bottleGen.genericMethodHalfGenArgs(new Bottle(45, "sdfsd"), "sdfsd");

        GenericMethodsInGenericClassT<Can> canGen = new GenericMethodsInGenericClassT<>();
        canGen.genericMethodOneGenArg(new Can(10, "Caaaan"));
        canGen.genericMethodTwoGenArgs(new Can(100, "BB-skdjf"), 38473);
        canGen.genericMethodHalfGenArgs(new Can(45, "s3948697 hidfu fd i"), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Mug> mugGen = new GenericMethodsInGenericClassT<>();
        mugGen.genericMethodOneGenArg(new Mug(10, "muuuuug"));
        mugGen.genericMethodTwoGenArgs(new Mug(100, "BB-skdjf"), 38473);
        mugGen.genericMethodHalfGenArgs(new Mug(45, "s3948697 hidfu fd i"), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Beetle> beetleGen = new GenericMethodsInGenericClassT<>();
        beetleGen.genericMethodOneGenArg(new Beetle(10, "muuuuug"));
        beetleGen.genericMethodTwoGenArgs(new Beetle(100, "BB-skdjf"), 38473);
        beetleGen.genericMethodHalfGenArgs(new Beetle(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Carrot> carrotGen = new GenericMethodsInGenericClassT<>();
        carrotGen.genericMethodOneGenArg(new Carrot(10, "muuuuug"));
        carrotGen.genericMethodTwoGenArgs(new Carrot(100, "BB-skdjf"), 38473);
        carrotGen.genericMethodHalfGenArgs(new Carrot(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Chamomile> chamomileGen = new GenericMethodsInGenericClassT<>();
        chamomileGen.genericMethodOneGenArg(new Chamomile(10, "muuuuug"));
        chamomileGen.genericMethodTwoGenArgs(new Chamomile(100, "BB-skdjf"), 38473);
        chamomileGen.genericMethodHalfGenArgs(new Chamomile(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Crocodile> crocodileGen = new GenericMethodsInGenericClassT<>();
        crocodileGen.genericMethodOneGenArg(new Crocodile(10, "muuuuug"));
        crocodileGen.genericMethodTwoGenArgs(new Crocodile(100, "BB-skdjf"), 38473);
        crocodileGen.genericMethodHalfGenArgs(new Crocodile(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Fly> flyGen = new GenericMethodsInGenericClassT<>();
        flyGen.genericMethodOneGenArg(new Fly(10, "muuuuug"));
        flyGen.genericMethodTwoGenArgs(new Fly(100, "BB-skdjf"), 38473);
        flyGen.genericMethodHalfGenArgs(new Fly(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Maylily> maylilyGen = new GenericMethodsInGenericClassT<>();
        maylilyGen.genericMethodOneGenArg(new Maylily(10, "muuuuug"));
        maylilyGen.genericMethodTwoGenArgs(new Maylily(100, "BB-skdjf"), 38473);
        maylilyGen.genericMethodHalfGenArgs(new Maylily(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Mosquito> mosquitoGen = new GenericMethodsInGenericClassT<>();
        mosquitoGen.genericMethodOneGenArg(new Mosquito(10, "muuuuug"));
        mosquitoGen.genericMethodTwoGenArgs(new Mosquito(100, "BB-skdjf"), 38473);
        mosquitoGen.genericMethodHalfGenArgs(new Mosquito(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Pigeon> pigeonGen = new GenericMethodsInGenericClassT<>();
        pigeonGen.genericMethodOneGenArg(new Pigeon(10, "muuuuug"));
        pigeonGen.genericMethodTwoGenArgs(new Pigeon(100, "BB-skdjf"), 38473);
        pigeonGen.genericMethodHalfGenArgs(new Pigeon(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Potato> potatoGen = new GenericMethodsInGenericClassT<>();
        potatoGen.genericMethodOneGenArg(new Potato(10, "muuuuug"));
        potatoGen.genericMethodTwoGenArgs(new Potato(100, "BB-skdjf"), 38473);
        potatoGen.genericMethodHalfGenArgs(new Potato(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Radish> radishGen = new GenericMethodsInGenericClassT<>();
        radishGen.genericMethodOneGenArg(new Radish(10, "muuuuug"));
        radishGen.genericMethodTwoGenArgs(new Radish(100, "BB-skdjf"), 38473);
        radishGen.genericMethodHalfGenArgs(new Radish(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Raven> ravenGen = new GenericMethodsInGenericClassT<>();
        ravenGen.genericMethodOneGenArg(new Raven(10, "muuuuug"));
        ravenGen.genericMethodTwoGenArgs(new Raven(100, "BB-skdjf"), 38473);
        ravenGen.genericMethodHalfGenArgs(new Raven(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Rose> roseGen = new GenericMethodsInGenericClassT<>();
        roseGen.genericMethodOneGenArg(new Rose(10, "muuuuug"));
        roseGen.genericMethodTwoGenArgs(new Rose(100, "BB-skdjf"), 38473);
        roseGen.genericMethodHalfGenArgs(new Rose(45, "s3948697 hidfu "), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Diesel> dieselGen = new GenericMethodsInGenericClassT<>();
        dieselGen.genericMethodOneGenArg(new Diesel(123));
        dieselGen.genericMethodTwoGenArgs(new Diesel(34534), 34534);
        dieselGen.genericMethodHalfGenArgs(new Diesel(7857856), "IUDIGDGLIUGDSLI");

        GenericMethodsInGenericClassT<Petrol> petrolGen = new GenericMethodsInGenericClassT<>();
        petrolGen.genericMethodOneGenArg(new Petrol(123));
        petrolGen.genericMethodTwoGenArgs(new Petrol(34534), 34534);
        petrolGen.genericMethodHalfGenArgs(new Petrol(7857856), "IUDIGD dfgdf GLIUGDSLI");

        GenericMethodsInGenericClassT<Water> waterGen = new GenericMethodsInGenericClassT<>();
        waterGen.genericMethodOneGenArg(new Water(123));
        waterGen.genericMethodTwoGenArgs(new Water(34534), 34534);
        waterGen.genericMethodHalfGenArgs(new Water(7857856), "IUDIGD dfgdf GLIUGDSLI");

    }

}