package homework.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Booking {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://booking.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.findElement(By.xpath("//*[contains(@aria-label, 'Dismiss sign in')]")).click();
        } catch (NoSuchElementException e) {
            System.out.println("close the modal window");
        }

        WebElement searchField = driver.findElement(By.name("ss"));
        searchField.click();
        searchField.sendKeys("Paris");

        driver.findElement(By.xpath("//span[@data-testid='date-display-field-start']")).click();

        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        driver.findElement(By.xpath("//span[@data-date='" + checkInDate.format(formatter) + "']")).click();
        driver.findElement(By.xpath("//span[@data-date='" + checkOutDate.format(formatter) + "']")).click();

        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        WebElement adults = driver.findElement(By.xpath("//label[@for='group_adults']/../following-sibling::div/button[2]"));
        adults.click();
        adults.click();

        driver.findElement(By.xpath("//label[@for='no_rooms']/../following-sibling::div/button[2]")).click();

        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        driver.findElement(By.xpath("//div[@data-filters-item='class:class=5']")).click();
        driver.findElement(By.xpath("//div//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//li//button[@aria-label='Property rating and price']")).click();

        driver.findElement(By.xpath("//div[@data-testid='property-card'][1]"));
        driver.findElement(By.xpath(".//div[@data-testid='rating-stars']"));
        String stars = driver.findElement(By.xpath("//div[@aria-label='5 out of 5'][1]")).getAttribute("aria-label");
        System.out.println("Hotels with rating: " + stars);

    }
}
