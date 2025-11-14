package homework.day16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DemoQATest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testSelectAnyValueInEachDropdowns() {
        driver.get("https://demoqa.com/select-menu");

        driver.findElement(By.xpath("//div[@id='withOptGroup']")).click();
        driver.findElement(By.xpath("//div[text()='Group 1, option 1']")).click();

        driver.findElement(By.xpath("//div[@id='selectOne']")).click();
        driver.findElement(By.xpath("//div[text()='Dr.']")).click();

        WebElement oldStyleSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select oldStylesl = new Select(oldStyleSelectMenu);
        oldStylesl.selectByVisibleText("Green");

        WebElement multiSelect = driver.findElement(By.id("react-select-4-input"));
        multiSelect.sendKeys("Green");
        multiSelect.sendKeys(Keys.ENTER);
        multiSelect.sendKeys("Blue");
        multiSelect.sendKeys(Keys.ENTER);
        driver.findElement(By.tagName("body")).click();

        WebElement standartMultiSelect = driver.findElement(By.id("cars"));
        Select standartms = new Select(standartMultiSelect);
        standartms.selectByVisibleText("Volvo");
        standartms.selectByVisibleText("Opel");

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

