package homework.day1.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int i) {
        if (i < 8) {
            return i * 7;
        } else {
            return i / 4;
        }
    }

    public long returnNewLong(long l) {
        if (l > 300) {
            return -300;
        } else {
            return +20;
        }
    }

    public String returnNewChar(char ch) {
        if (ch == 'g') {
            return "go";
        } else {
            return "o" + ch;
        }
    }

    public float returnNewFloat(float f) {
        if (f == 0.67) {
            return f;
        } else {
            return f * 2;
        }
    }

    public double returnNewDouble(double d) {
        if (d > 30 && d < 80) {
            return d + 87;
        } else if (d > 80 && d < 400) {
            return d - 87;
        } else if (d > 400) {
            return d / 4;
        } else {
            return d;
        }
    }

    public void returnNewBoolean(boolean b) {
        if (b) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
