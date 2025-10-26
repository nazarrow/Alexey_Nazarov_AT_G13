package main.java.homework.day1.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + trainMethodsIf.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(200));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar('g'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(0.66f));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(32.22));
        trainMethodsIf.returnNewBoolean(true);
    }
}
