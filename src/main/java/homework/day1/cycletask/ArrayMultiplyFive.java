package main.java.homework.day1.cycletask;

public class ArrayMultiplyFive {

    public int[] methAMF() {
        ArrayReversseOrder arrayReversseOrder = new ArrayReversseOrder();
        arrayReversseOrder.methodARO();

        int[] array = arrayReversseOrder.methodARO();
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 5;
            System.out.println(array[i] + " AMF");
        }
        return array;
    }

}
