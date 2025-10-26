package main.java.playground.essence.creatures;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.println("wr-wr-wrr-r..");
    }
}
