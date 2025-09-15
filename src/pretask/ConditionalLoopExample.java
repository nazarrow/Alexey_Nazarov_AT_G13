package pretask;

public class ConditionalLoopExample {
    public static void main(String[] args) {
        //используйте цикл for, чтобы вывести четные числа от 1 до 10,
        // с использованием условного оператора if для пропуска нечетных чисел
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
