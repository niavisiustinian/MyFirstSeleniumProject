import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    private WebDriver driver;
    @Before
    public void openMadisson(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
   @Test
   public void addToWish1(){
       driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
       driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
       driver.findElement(By.cssSelector("#email")).sendKeys("email1@email.com");
       driver.findElement(By.cssSelector("#pass")).sendKeys("parola");
       driver.findElement(By.cssSelector("#send2")).click();
       driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent")).click();
       driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
       driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
       WebElement wishList = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > ul > li > ul > li > span"));
       Assert.assertEquals( " has been added to your wishlist. Click here to continue shopping.",wishList.getText());


    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
