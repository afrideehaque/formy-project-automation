import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/Users/afrideehaque/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        //WebElement firstNameField = driver.findElement(By.id("first-name"));
        //firstNameField.sendKeys("Afridee");
        driver.findElement(By.id("first-name")).sendKeys("Afridee");

        //WebElement lastNameField = driver.findElement(By.id("last-name"));
        //lastNameField.sendKeys("Haque");
        driver.findElement(By.id("last-name")).sendKeys("Haque");

        //WebElement jobTitleField = driver.findElement(By.id("job-title"));
        //jobTitleField.sendKeys("QA Engineer");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        //WebElement levelOfEducation = driver.findElement(By.id("radio-button-3"));
        //levelOfEducation.click();
        driver.findElement(By.id("radio-button-3")).click();

        WebElement gender = driver.findElement(By.id("checkbox-1"));
        gender.click();

        //WebElement yearsOfExperience = driver.findElement(By.id("select-menu"));
        //yearsOfExperience.click();

        WebElement yearsOfExperience = driver.findElement(By.cssSelector("option[value='3']"));
        yearsOfExperience.click();

        driver.findElement(By.id("datepicker")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]")).click();

        driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement resultTest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));



        //Thread.sleep(2000);

        driver.quit();
    }
}
