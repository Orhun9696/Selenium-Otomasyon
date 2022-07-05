package Page;

import com.testinium.driver.BaseTest;
import org.openqa.selenium.By;

public class LocatorPage extends BaseTest{
    public static By controlHomePage = By.xpath("//span[@class='dropdown-label'][1]");
    public static By login = By.xpath("//span[@class='dropdown-label'][1]");
    public static By email = By.name("email");
    public static By password = By.name("password");
    public static By loginButton = By.xpath("//button[@type='submit']");
    public static By controlLoginPage = By.xpath("//span[@class='dropdown-label'][1]");
    public static By searchButton = By.id("search_input");

}
