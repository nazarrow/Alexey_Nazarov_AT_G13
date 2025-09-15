package cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {

// CycleTask (для него создаем отдельный пакет cycletask и каждое подзадание делаем
// в отдельном классе, имена классов и методов на ваше усмотрение, запускаем в отдельном
// классе CycleTaskRunner, где создаем обьект соответствующего типа и вызываем нужный
// метод)

        While aWhile = new While();
        aWhile.methodWhile();

        For aFor = new For();
        aFor.methodFor();
//    new For().methodFor();

        Array aArray = new Array();
        aArray.methodArray();

        ArrayConsole arrayConsole = new ArrayConsole();
        arrayConsole.methodArrayConsole();

        ArrayReversseOrder arrayReversseOrder = new ArrayReversseOrder();
        arrayReversseOrder.methodARO();

        ArrayMultiplyFive arrayMultiplyFive = new ArrayMultiplyFive();
        arrayMultiplyFive.methAMF();

        ArraySquare arraySquare = new ArraySquare();
        arraySquare.methAS();

        ArrayMinimal arrayMinimal = new ArrayMinimal();
        arrayMinimal.methArmMin();

        ArraySwap arraySwap = new ArraySwap();
        arraySwap.methArraySwap();

        ArraySortingDescending arraySortingDescending = new ArraySortingDescending();
        arraySortingDescending.methASS();
    }
}
