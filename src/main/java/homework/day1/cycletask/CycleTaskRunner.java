package main.java.homework.day1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {

        While aWhile = new While();
        aWhile.methodWhile();

        For aFor = new For();
        aFor.methodFor();
//    new For().methodFor();

        ArrayEmpty aArrayEmpty = new ArrayEmpty();
        aArrayEmpty.methodArray();

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
