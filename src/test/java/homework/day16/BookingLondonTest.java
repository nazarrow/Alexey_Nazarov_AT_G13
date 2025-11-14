package homework.day16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class BookingLondonTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testBookingLondonHotelStyling() throws IOException {

        //Перейти на сайт booking.com
        driver.get("https://booking.com");

        try {
            driver.findElement(By.xpath("//*[contains(@aria-label, 'Dismiss sign in')]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("close the modal window");
        }

        //Найти отели для города «London»
        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.click();
        searchField.sendKeys("London");

        //Выбрать London из выпадающего списка
        driver.findElement(By.xpath("//div[text()='London']")).click();

        //Нажать кнопку поиска
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //        3. Проскролить страницу к 10-му отелю сверху
        WebElement HotelTen = driver.findElement(By.xpath("//div[@role='listitem'][10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", HotelTen);

        //        4. Изменить цвет фона на зеленый, а цвет текста названия на красный
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green';", HotelTen);

        WebElement hotelTitle = HotelTen.findElement(By.cssSelector("div[data-testid='title']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", hotelTitle);

        //        5. Сделать скриншот
        FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
                new File("D:\\Download\\Java_AT\\Alexey_Nazarov_AT_G13\\files\\screenshot.png"));

    }

    @After
    public void tearDown() {
        // Закрытие браузера
        if (driver != null) {
            driver.quit();
        }
    }
}
