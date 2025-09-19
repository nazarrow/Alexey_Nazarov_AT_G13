package playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {

    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (this.getMass() < home.getMass()) {
            int wholeOfDivision = home.getMass() / this.getMass();
            System.out.printf("I am %s and I will nest there with %d my family members!", this.getName(), wholeOfDivision);
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

    @Override
    public void crawl() {

    }
}
