import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterClass {
    private WebDriver driver;
    @Before
    public void openMadisson(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void registerWithValidCredidentials() {

       driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
       driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
       driver.findElement(By.cssSelector("#firstname")).sendKeys("Andrei");
       driver.findElement(By.cssSelector("#lastname")).sendKeys("Pop");
       driver.findElement(By.cssSelector("#email_address")).sendKeys("email1@email.com");
       driver.findElement(By.cssSelector("#password")).sendKeys("parola");
       driver.findElement(By.cssSelector("#confirmation")).sendKeys("parola");
       driver.findElement(By.cssSelector("#is_subscribed")).click();
       driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
       WebElement checkRegister = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li > span"));
        Assert.assertFalse(checkRegister.isDisplayed());

    }
    @After
   public void closeBrowser()
    {
        driver.quit();
    }

}
