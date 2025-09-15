package basetask;

public class Mouse {

    private String name;
    private int age;

    // Конструктор, принимающий имя и возраст
    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails() {
//        System.out.println("Я мышь, меня зовут " + name + "и мне " + age + " лет");
        System.out.printf("Я мышь, меня зовут %s и мне %d лет%n", name, age);
    }


}
