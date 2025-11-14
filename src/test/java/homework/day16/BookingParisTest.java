package homework.day16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingParisTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testParisHotelSearchWithFiveStarsRating() {

        //Открыть сайт Booking.com
        driver.get("https://booking.com");

        //Закрыть модальное окно, если оно присутствует
        try {
            driver.findElement(By.xpath("//*[contains(@aria-label, 'Dismiss sign in')]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("Модальное окно не найдено");
        }

        //Ввести "Paris" в поле поиска
        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.click();
        searchField.sendKeys("Paris");

        //Выбрать даты заезда и выезда. проживание на 7 ночей c заездом через 3 дня
        driver.findElement(By.xpath("//span[@data-testid='date-display-field-start']")).click();

        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        driver.findElement(By.xpath("//span[@data-date='" + checkInDate.format(formatter) + "']")).click();
        driver.findElement(By.xpath("//span[@data-date='" + checkOutDate.format(formatter) + "']")).click();

        //Настроить количество гостей и комнат. для 4 взрослых в 2 номерах
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        WebElement adults = driver.findElement(By.xpath("//label[@for='group_adults']/../following-sibling::div/button[2]"));
        adults.click();
        adults.click();

        driver.findElement(By.xpath("//label[@for='no_rooms']/../following-sibling::div/button[2]")).click();

        //Выполнить поиск
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        //Отфильтровать отели с рейтингом 5
        driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']")).click();

        //Отсортировать по рейтингу начиная с самого низкого
        driver.findElement(By.xpath("//div//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//li//button[@aria-label='Property rating and price']")).click();

        //и проверить, что у первого в списке он == 5
        driver.findElement(By.xpath("//div[@data-testid='property-card'][1]"));
        driver.findElement(By.xpath(".//div[@data-testid='rating-stars']"));

        String stars = driver.findElement(By.xpath("//div[@aria-label='5 out of 5'][1]")).getAttribute("aria-label");
        System.out.println("Hotels with rating: " + stars);

        // Проверка, что рейтинг содержит "5 out of 5"
//        assertTrue("Рейтинг отеля должен быть 5 звезд", stars.contains("5 out of 5"));
    }

    @After
    public void tearDown() {
        // Закрытие браузера после теста
        if (driver != null) {
            driver.quit();
        }
    }
}