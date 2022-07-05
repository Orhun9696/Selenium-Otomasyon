package Page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

import static Page.LocatorPage.searchButton;


public class ProductPage {

    Methods methods;

    public ProductPage(){
        methods = new Methods();
    }

    public void searchProduct(){
        methods.findElement(searchButton).clear();
        methods.waitBySeconds(3);
        methods.sendKeys(searchButton,"Pantalon");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//button[@class='searchButton']"));
        methods.waitBySeconds(3);
        methods.scrollWithJavaScript(By.xpath("//div[@class='product-card product-card--one-of-4'][95]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//button[@class='paginator__button']"));
        methods.waitBySeconds(5);
    }
}
