package classwork.day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class SeleniumTestGoogle {

    public static void main(String[] args) throws MalformedURLException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());
        webDriver.quit();
    }
}
