package homework.day4;

public class ArraysAndConsole {

    public int countSum(int[] arr, int n) {
        int sum = 0;
        for (int i = n - 1; i < arr.length; i = i + n) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int[] arrLargerN(int[] arrDesc, int n) {
        int count = 0;
        for (int num : arrDesc) {
            if (num > n) {
                count++;
            }
        }

        int[] result = new int[count];

        int a = 1;
        for (int i : arrDesc) {
            if (i > n) {
                result[result.length - a] = i;
                a++;
            }
        }
        return result;
    }

    public int sumArrElements(int[] arr2) {
        int length = arr2.length;
        int firstDigit = length;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        if (firstDigit == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : arr2) {
            if (num % firstDigit == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public String draw() {
        System.out.println(" ");
        System.out.println("      ^__^");
        System.out.println("      (oo)\\\\_______");
        System.out.println("     (__)\\ ) \\/\\  \\");
        System.out.println("          ||----w |\\");
        System.out.println("          ||     ||");
        return "";
    }
}

