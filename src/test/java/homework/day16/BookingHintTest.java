package homework.day16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BookingHintTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testCurrencyTooltip() {

        driver.get("https://booking.com");

        try {
            driver.findElement(By.xpath("//*[contains(@aria-label, 'Dismiss sign in')]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("close the modal window");
        }

        // 2. Навести мышь на индикатор валюты
        WebElement currencyIcon = driver.findElement(By.xpath("//button[@data-testid='header-currency-picker-trigger']"));
        Actions hoverIcon = new Actions(driver);
        hoverIcon.moveToElement(currencyIcon).perform();

        // 3. Проверить значение подсказки
        String actual = driver.findElement(By.xpath("//body/div[last()]/div")).getText();
        String expected = "Select your currency";
        if (!expected.equals(actual)) {
            throw new AssertionError("Ожидалось: '" + expected + "', но получено: '" + actual + "'");
        }

        // 4. Навести мышь на индикатор языка
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement languageIcon = driver.findElement(By.xpath("//button[@data-testid='header-language-picker-trigger']"));
        Actions hoverLangIcon = new Actions(driver);
        hoverLangIcon.moveToElement(languageIcon).perform();

        // 5. Проверить значение подсказки
        WebElement hoverLanguage = driver.findElement(By.xpath("//body/div[last()]"));
        String actual2 = hoverLanguage.getText();
        String expected2 = "Select your language";
        if (!expected.equals(actual2)) {
            throw new AssertionError("Ожидалось: '" + expected2 + "', но получено: '" + actual2 + "'");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

