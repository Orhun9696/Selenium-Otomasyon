package Test;

import Page.ProductPage;
import com.testinium.driver.BaseTest;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.searchProduct();
    }
}
