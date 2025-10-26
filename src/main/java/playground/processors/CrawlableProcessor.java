package main.java.playground.processors;

import main.java.playground.essence.creatures.Crawlable;
import main.java.playground.utils.DirectionGenerator;
import main.java.playground.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        crawlable.crawl(DirectionGenerator.generateDirection(), DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        crawlable.crawl(direction, DistanceGenerator.generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}
