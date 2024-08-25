import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/afrideehaque/Downloads/chromedriver-mac-x64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);

        waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", getMessage(driver));


//        driver.get("https://formy-project.herokuapp.com/form");
//
//        driver.findElement(By.id("first-name")).sendKeys("John");
//
//        driver.findElement(By.id("last-name")).sendKeys("Doe");
//
//        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
//
//        driver.findElement(By.id("radio-button-2")).click();
//
//        driver.findElement(By.id("checkbox-2")).click();
//
//        driver.findElement(By.cssSelector("option[value='1']")).click();
//
//        driver.findElement(By.id("datepicker")).sendKeys("05/28/2019");
//        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
//
//        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
//
//        String alertText = alert.getText();
//
//        assertEquals("The form was successfully submitted!", alertText);

        driver.quit();
    }

    public static void submitForm(WebDriver driver)
    {
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

        WebElement yearsOfExperience = driver.findElement(By.cssSelector("option[value='3']"));
        yearsOfExperience.click();

        driver.findElement(By.id("datepicker")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]")).click();

        driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();

    }

    public static void waitForAlertBanner (WebDriver driver)
    {

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement resultTest = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getMessage (WebDriver driver)
    {
        return driver.findElement(By.className("alert")).getText();
    }

}
