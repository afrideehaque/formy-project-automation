import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/Users/afrideehaque/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        Thread.sleep(1000);

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();

        Thread.sleep(1000);

        //WebElement autoCompleteButton = driver.findElement(By.id("autocomplete"));
        //autoCompleteButton.click();

        WebElement dragAndDropButton = driver.findElement(By.cssSelector(".dropdown-menu.show a[href='/dragdrop']"));
        dragAndDropButton.click();

        Thread.sleep(1000);

        driver.quit();
    }
}
