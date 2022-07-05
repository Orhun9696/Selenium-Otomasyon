package Test;

import Page.BasketPage;
import Page.ProductPage;
import com.testinium.driver.BaseTest;
import org.junit.Test;

public class EndToEndTest extends BaseTest {

    @Test
    public void endToEnd(){
        ProductPage productPage = new ProductPage();
        BasketPage basketPage = new BasketPage();
        productPage.searchProduct();
        basketPage.addProductToBasket();
        basketPage.controlValue();
        basketPage.increaseProduct();
        basketPage.controlEmptyBasket();
    }
}
