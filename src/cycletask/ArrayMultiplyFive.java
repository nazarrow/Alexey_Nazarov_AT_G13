package cycletask;

public class ArrayMultiplyFive {
//    каждый элемент массива умножить на 5 и вывести результат в консоль

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
