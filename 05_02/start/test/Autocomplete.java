import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/Users/afrideehaque/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");


        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        //Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        //WebElement okButton = driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/td[2]/button"));
        WebElement okButton = driver.findElement(By.className("dismissButton"));
        okButton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.quit();
    }
}
