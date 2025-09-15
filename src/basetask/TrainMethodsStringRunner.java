package basetask;

public class TrainMethodsStringRunner {
    public static void main(String[] args) {
        //создать класс TrainMethodsStringRunner с методом main, в этом методе создать объект класса TrainMethodsString
        // и вызвать всего его методы
        TrainMethodsString trainMethodsString = new TrainMethodsString();
        trainMethodsString.printMama();
        trainMethodsString.printPapa();
        trainMethodsString.printString("empty string");
        trainMethodsString.printMamaString("");
    }
}
