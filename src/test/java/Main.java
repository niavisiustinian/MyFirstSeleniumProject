import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WishListTest wlt = new WishListTest();
        wlt.addToWish1();

        RegisterClass register = new RegisterClass();
         register.register1();

        LoginTest login = new LoginTest();
        login.login1();
        login.logout();

    }
}
