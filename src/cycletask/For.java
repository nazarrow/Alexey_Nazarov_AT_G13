package cycletask;

public class For {

//    используя for вывести в консоль каждое нечетное число от 3 до 19 включительно

    public void methodFor() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.println("нечетные " + i);
            }
        }
    }
}
