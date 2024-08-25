import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/Users/afrideehaque/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        Thread.sleep(1000);

        WebElement openAlertButton = driver.findElement(By.id("alert-button"));
        openAlertButton.click();

        Thread.sleep(1000);

        Alert alertAfterButtonClicked = driver.switchTo().alert();
        alertAfterButtonClicked.accept();

        Thread.sleep(1000);

        driver.quit();
    }
}
