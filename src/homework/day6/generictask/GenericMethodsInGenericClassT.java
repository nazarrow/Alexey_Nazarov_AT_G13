package homework.day6.generictask;

public class GenericMethodsInGenericClassT<T> {

    public <X> void genericMethodOneGenArg(X argX) {
        System.out.printf("I am an object of %s class\n",
                argX.getClass().getSimpleName());
    }

    public <X, Y> String genericMethodTwoGenArgs(X oneArg, Y twoArg) {
        return String.valueOf(System.out.printf("We are objects of %s class and %s class\n",
                oneArg.getClass().getSimpleName(), twoArg.getClass().getSimpleName()));
    }

    public <X> void genericMethodHalfGenArgs(X threeArg, String strArg) {
        System.out.printf("I got an object of %s class and string with %d characters\n",
                threeArg.getClass().getSimpleName(), strArg.length());
    }
}
