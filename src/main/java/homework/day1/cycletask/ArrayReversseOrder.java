package main.java.homework.day1.cycletask;

public class ArrayReversseOrder {

    public int[] methodARO() {
        ArrayConsole arrayConsole = new ArrayConsole();
        arrayConsole.methodArrayConsole();

        int[] array = arrayConsole.methodArrayConsole();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ARO");
        }
        return array;
    }
}
