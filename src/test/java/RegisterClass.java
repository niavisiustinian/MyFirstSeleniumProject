import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterClass {

   public void register1() {
       WebDriver driver = new ChromeDriver();
       driver.get("http://testfasttrackit.info/selenium-test/");
       driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
       driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
       driver.findElement(By.cssSelector("#firstname")).sendKeys("Andrei");
       driver.findElement(By.cssSelector("#lastname")).sendKeys("Pop");
       driver.findElement(By.cssSelector("#email_address")).sendKeys("email1@email.com");
       driver.findElement(By.cssSelector("#password")).sendKeys("parola");
       driver.findElement(By.cssSelector("#confirmation")).sendKeys("parola");
       driver.findElement(By.cssSelector("#is_subscribed")).click();
       driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
       driver.quit();


   }

}
