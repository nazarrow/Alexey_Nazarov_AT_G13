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

public class BookingPragueTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Инициализация драйвера
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void testPragueHotelWithHighRating() {

        driver.get("https://booking.com");

        try {
            driver.findElement(By.xpath("//*[contains(@aria-label, 'Dismiss sign in')]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("close the modal window");
        }

        //Ввести в поиск «Prague»
        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.click();
        searchField.sendKeys("Prague");

        //        2. Ввести в поиск «Прага», выбрать для проживания 2 гостей и 1 номер
        driver.findElement(By.xpath("//span[@data-testid='date-display-field-start']")).click();
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        //        3. Отфильтровать отели с максимальным рейтингом
        driver.findElement(By.xpath("//div[@data-filters-item='review_score:review_score=90']")).click();

        //        4. Открыть страницу с первым таким отелем и проверить, что его рейтинг >=9
        driver.findElement(By.xpath("//div[@role='listitem'][1]//div[@data-testid='title']"));

        WebElement ratingElement = driver.findElement(
                By.xpath("//div[@data-testid='review-score']/div[2]"));

        String ratingText = ratingElement.getText();
        double rating = Double.parseDouble(ratingText);

        System.out.println("Hotel rating: " + rating);

        if (rating >= 9.0) {
            System.out.println("SUCCESS: Hotel rating is >= 9");
        } else {
            System.out.println("FAIL: Hotel rating is < 9");
        }
    }

    @After
    public void tearDown() {
        // Закрытие браузера после теста
        if (driver != null) {
            driver.quit();
        }

    }
}
