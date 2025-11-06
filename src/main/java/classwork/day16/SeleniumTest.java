package classwork.day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class SeleniumTest {

    public static void main(String[] args) throws MalformedURLException {
        //запуск локально
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://selenium.dev");
    }
}
