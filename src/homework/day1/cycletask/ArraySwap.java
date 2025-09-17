package homework.day1.cycletask;

public class ArraySwap {

    public int[] methArraySwap() {
        ArrayMinimal arrayMinimal = new ArrayMinimal();
        arrayMinimal.methArmMin();

        int[] array = arrayMinimal.methArmMin();
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ArraySwap");
        }
        return array;
    }
}
