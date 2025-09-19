package playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public void eat(Insect food) {
        String strFormat = String.format("I am %s and I am eating %s", this.name, food.getName());
        System.out.println(strFormat);
    }
}
