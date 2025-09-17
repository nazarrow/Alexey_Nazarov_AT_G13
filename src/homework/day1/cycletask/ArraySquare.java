package homework.day1.cycletask;

public class ArraySquare {

    public int[] methAS() {
        ArrayMultiplyFive arrayMultiplyFive = new ArrayMultiplyFive();
        arrayMultiplyFive.methAMF();

        int[] array = arrayMultiplyFive.methAMF();
        for (int i = 0; i < array.length; i++) {
            int squared = array[i] * array[i];
            System.out.println(array[i] + " ArraySquare");
        }
        return array;
    }

}
