import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;


  @Before
  public void openMadisson(){
      System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
       driver = new ChromeDriver();
      driver.get("http://testfasttrackit.info/selenium-test/");
  }
  @Test
  public void loginValidEmail(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("email1@email.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("parola");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement checkLogin = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertTrue(checkLogin.isDisplayed());

  }
  @Test
  public void loginInvalidEmail(){
      driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
      driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
      driver.findElement(By.cssSelector("#email")).sendKeys("mail1@email.com");
      driver.findElement(By.cssSelector("#pass")).sendKeys("parola");
      driver.findElement(By.cssSelector("#send2")).click();
      WebElement checkLogin = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li > span"));
      Assert.assertTrue(checkLogin.isDisplayed());

  }
  @Test
  public void loginInvalidPassword(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("mail1@email.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("paola");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement checkLogin = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li > span"));
        Assert.assertTrue(checkLogin.isDisplayed());

  }



  @Test
  public void logout(){
     //you need to be loged in for this test to pass
      driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
      WebElement logout = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
      Assert.assertEquals("Log Out",logout.getText());

  }
  @After
   public void closeBrowser(){
     driver.quit();
   }
}
