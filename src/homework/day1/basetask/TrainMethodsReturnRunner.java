package homework.day1.basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(10));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar((char) '?'));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(10.2F));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(100.8));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 200));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 777));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));
    }
}
