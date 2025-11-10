package homework.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class W3schools {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/java/");

        WebElement tutorial = driver.findElement(By.xpath("//span[text()='Tutorial']"));

        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .perform();

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://google.com");

        WebElement search1 = driver1.findElement(By.name("q"));
        Actions make2 = new Actions(driver1);
        make2
                .click(search1)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyDown(Keys.ENTER)
                .perform();

        List<WebElement> searchResult = driver1.findElements(By.xpath("//h3"));
        String expectedText = "tutorial";
        for (WebElement title : searchResult) {
            String actualText = title.getText().toLowerCase();
            if (!actualText.contains(expectedText)) {
                System.out.println("Ошибка: заголовок '" + actualText + "' не содержит '" + expectedText + "'");
            }
        }
        driver.quit();
        driver1.quit();

    }
}
