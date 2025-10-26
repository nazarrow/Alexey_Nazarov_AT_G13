package main.java.homework.day6.generictask;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public <P, L> String genericMethodGenArgs(P argP, L argL) {
        return String.format("I received 2 arguments of type: %s class, %s class",
                argP.getClass().getSimpleName(),
                argL.getClass().getSimpleName());
    }

    public <P> String genericMethodGenArgs(P argP) {
        return String.format("I received 1 arguments of type: %s class",
                argP.getClass().getSimpleName());
    }

    public <M> void genericMethodHalfGenArgs(M argM, String strM) {
        System.out.printf("I got an object of %s class and string with %d characters\n",
                argM.getClass().getSimpleName(), strM.length());
    }

    public <M, N> void genericMethodHalfGenArgs(M argM, N argN, String strN) {
        System.out.printf("I got an object of %s class and %s class and and string with %d characters\n",
                argM.getClass().getSimpleName(), argN.getClass().getSimpleName(), strN.length());
    }
}
