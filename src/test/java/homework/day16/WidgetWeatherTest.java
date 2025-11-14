package homework.day16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class WidgetWeatherTest {

    private WebDriver driver;
    //    private LocalDate localDate;
    private String nextDay;

    @Before
    public void setUp() {
        LocalDate localDate = LocalDate.now().plusDays(1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        nextDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("be"));

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @Test
    public void testWeatherForecast() {
        //Переход на Google
        driver.get("https://google.com");

        //Поиск погоды в Минске
        driver.findElement(By.name("q")).sendKeys("погода минск");
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();

        //Открытие виджета погоды
        driver.findElement(By.xpath("//div[@data-wob-di='1']")).click();

        //Поиск прогноза на следующий день в 12:00
        List<WebElement> hours = driver.findElements(By.xpath("//*[contains(@aria-label, 'Celsius') and contains(@aria-label, '" + nextDay + " 12:00')]"));

        // Проверка, что элементы найдены
        assertFalse("No weather elements found for " + nextDay + " 12:00", hours.isEmpty());

        // Получение и вывод прогноза
        WebElement hourElement = hours.getFirst();
        String ariaLabel = hourElement.getAttribute("aria-label");
        assertNotNull("Weather forecast is null", ariaLabel);

        System.out.println("Прогноз на " + nextDay + " в 12:00: " + ariaLabel);
    }

    @After
    public void tearDown() {
        // Закрытие браузера
        if (driver != null) {
            driver.quit();
        }
    }
}
