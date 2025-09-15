package cycletask;

public class ArrayMinimal {

//    найти минимальный элемент массива и вывести результат в консоль

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
