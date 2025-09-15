package cycletask;

public class ArrayReversseOrder {

//    вывести в консоль все элементы массива в обратном порядке

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
