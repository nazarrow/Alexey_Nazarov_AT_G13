package cycletask;

public class ArrayConsole {
    public int[] methodArrayConsole() {

//        пройти по массиву и вывести в консоль все элементы
        Array aaAray = new Array();
        aaAray.methodArray();


        for (int i : aaAray.methodArray()) {
            System.out.println(i + "ArrayConsole");
        }
        return aaAray.methodArray();
    }
}
