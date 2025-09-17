package homework.day1.cycletask;

public class ArrayConsole {
    public int[] methodArrayConsole() {

        ArrayEmpty aaAray = new ArrayEmpty();
        aaAray.methodArray();

        for (int i : aaAray.methodArray()) {
            System.out.println(i + "ArrayConsole");
        }
        return aaAray.methodArray();
    }
}
