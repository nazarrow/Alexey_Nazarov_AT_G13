package main.java.homework.day1.cycletask;

public class ArrayMinimal {

    public int[] methArmMin() {
        ArraySquare arraySquare = new ArraySquare();
        arraySquare.methAS();

        int[] array = arraySquare.methAS();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            System.out.println(min + " ArrayMinimal");
        }
        return array;
    }

}
