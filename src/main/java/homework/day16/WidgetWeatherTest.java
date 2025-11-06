package homework.day16;

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

public class WidgetWeatherTest {
    public static void main(String[] args) throws InterruptedException {
        LocalDate localDate = LocalDate.now().plusDays(1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String nextDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("be"));

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("погода минск");
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();
        driver.findElement(By.xpath("//div[@data-wob-di='1']")).click();

        List<WebElement> hours = driver.findElements(By.xpath("//*[contains(@aria-label, 'Celsius') and contains(@aria-label, '" + nextDay + " 12:00')]"));

        WebElement hourElement = hours.getFirst();
        String ariaLabel = hourElement.getAttribute("aria-label");
        System.out.println("Прогноз на " + nextDay + " в 12:00: " + ariaLabel);

        driver.quit();
    }
}
