package Test;

import Page.BasketPage;
import com.testinium.driver.BaseTest;
import org.junit.Test;

public class BasketTest extends BaseTest {

    @Test
    public void baseTest(){
        BasketPage basketPage = new BasketPage();
        basketPage.addProductToBasket();
    }
}
