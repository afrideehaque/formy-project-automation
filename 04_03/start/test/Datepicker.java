import com.gargoylesoftware.htmlunit.html.DomElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/Users/afrideehaque/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();

        Thread.sleep(1000);

        WebElement specifDatePickerSwitch = driver.findElement(By.cssSelector("th.datepicker-switch"));
        specifDatePickerSwitch.click();


        Thread.sleep(1000);

        WebElement specificDecade = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]"));
        specificDecade.click();

        Thread.sleep(1000);

        WebElement specificMonth = driver.findElement(By.xpath("/html/body/div[2]/div[4]/table/thead/tr[2]/th[2]"));
        specificMonth.click();
        //specificMonth.click();
        //specificMonth.click();

        Thread.sleep(1000);

        WebElement goToPreviousDecade = driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/thead/tr[2]/th[1]"));
        goToPreviousDecade.click();

        Thread.sleep(5000);

        String targetDate = "1719792000000";
        WebElement specificDate = driver.findElement(By.cssSelector("td.day[data-date='" + targetDate + "']"));
        specificDate.click();

        Thread.sleep(1000);

        driver.quit();
    }
}