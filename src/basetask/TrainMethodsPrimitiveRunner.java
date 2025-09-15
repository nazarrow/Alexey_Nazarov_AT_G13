package basetask;

public class TrainMethodsPrimitiveRunner {
    public static void main(String[] args) {
        //создать класс TrainMethodsPrimitiveRunner с методом main, в этом методе создать обьект класса TrainMethodsPrimitive
        // и вызвать всего его методы
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(32);
        trainMethodsPrimitive.printLong(200);
        trainMethodsPrimitive.printChar('&');
        trainMethodsPrimitive.printFloat(1.133f);
        trainMethodsPrimitive.printDouble(45.77);
        trainMethodsPrimitive.printShort((short) 4000);
        trainMethodsPrimitive.printByte((byte) 50000);
        trainMethodsPrimitive.printBoolean(true);
    }
}
