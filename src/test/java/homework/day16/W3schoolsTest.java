package homework.day16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class W3schoolsTest {

    private WebDriver driver;
    private WebDriver driver1;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver1 = new ChromeDriver();
    }

    @Test
    public void testW3schoolsTutorialSearch() {

        // Перейти на сайт https://www.w3schools.com/java/
        driver.get("https://www.w3schools.com/java/");

        //Двойным кликом выделить в заголовке слово Tutorial
        WebElement tutorial = driver.findElement(By.xpath("//span[text()='Tutorial']"));

        //Скопировать используя горячие клавиши Ctrl+c
        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c")
                .perform();

        //Перейти на сайт https://google.com
        driver1.get("https://google.com");

        //Вставить в строку поиска скопированное
        //Запустить поиск клавишей Enter
        WebElement search1 = driver1.findElement(By.name("q"));
        Actions make2 = new Actions(driver1);
        make2
                .click(search1)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyDown(Keys.ENTER)
                .perform();

        //Убедиться, что каждый из результатов содержит искомое слово
        List<WebElement> searchResult = driver1.findElements(By.xpath("//h3"));
        String expectedText = "tutorial";
        for (WebElement title : searchResult) {
            String actualText = title.getText().toLowerCase();
            if (!actualText.contains(expectedText)) {
                System.out.println("Ошибка: заголовок '" + actualText + "' не содержит '" + expectedText + "'");
            }
        }
    }

    @After
    public void tearDown() {
        // Закрываем браузеры после каждого теста
        if (driver != null) {
            driver.quit();
        }
        if (driver1 != null) {
            driver1.quit();
        }

    }
}
