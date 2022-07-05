package Test;

import Page.LoginPage;
import com.testinium.driver.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.controlLogin();
    }
}
