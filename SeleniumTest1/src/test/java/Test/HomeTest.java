package Test;

import Page.HomePage;
import com.testinium.driver.BaseTest;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void HomeTest(){
        HomePage homePage = new HomePage();
        homePage.controlHome();
    }

}
