package basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int number) {
        return number * 3;
    }

    public long returnNewLong(long longNum) {
        return longNum - 4;
    }

    public String returnNewChar(char charSym) {
        //создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таких символов
        return "" + charSym + charSym;
    }

    public float returnNewFloat(float floatVar) {
        return floatVar / 2;
    }

    public double returnNewDouble(double doubleVar) {
        return doubleVar + 8;
    }

    public short returnNewShort(short shortVar) {
        return (short) (shortVar - 1);
    }

    public byte returnNewByte(byte byteVar) {
        return (byte) (byteVar * 2);
    }

    public boolean returnNewBoolean(boolean boolVar) {
        return boolVar;
    }
}
