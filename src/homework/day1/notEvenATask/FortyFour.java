package homework.day1.notEvenATask;

public class FortyFour {
    public static void main(String[] args) {

//        int i = 23;
//        while (i < 28) {
//            if (i % 13 == 0) {
//                System.out.println("continue!");
//                break;
//            }
//            System.out.println("i is : " + i++);
//        }
//        System.out.println("number is : " + i);

        int e = 0;
        for (int i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
//                break;
//                return;
                continue;
            }
            System.out.println("i is : " + i++);
        }
        System.out.println("number is : " + e);

    }
}
