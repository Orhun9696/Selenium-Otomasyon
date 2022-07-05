package Page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class BasketPage {

    Methods methods;
    Logger logger = LogManager.getLogger(BasketPage.class);

    public BasketPage(){
        methods = new Methods();

    }
    public void addProductToBasket(){


        List<WebElement> allProducts = methods.listAll(By.xpath("//div[@class='page-wrapper']"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        logger.info("Ürünlerden rastgele biri seçildi");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@size='34']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@height='31']"));
        methods.waitBySeconds(3);
        methods.click(By.id("pd_add_to_cart"));
        logger.info("Ürün sepete eklendi");
        methods.waitBySeconds(3);
    }

    public void controlValue(){
        String value1 = methods.findElement(By.xpath("//div[@class='col-xs-12 price-area']")).getText();
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href='https://www.lcwaikiki.com/tr-TR/TR/sepetim']"));
        methods.waitBySeconds(3);
        String value2 = methods.findElement(By.xpath("//span[@class='rd-cart-item-price mb-15']")).getText();
        methods.waitBySeconds(3);
        System.out.println("Ürün listesindeki fiyat: " +value1 + "Sepetteki fiyat: " +value2);

    }

    public void increaseProduct(){
        methods.click(By.xpath("//a[@class='oq-up plus']"));
        logger.info("Ürün adedi arttırıldı");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//i[@class='fa fa-trash-o']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@class='inverted-modal-button sc-delete ins-init-condition-tracking']"));
        logger.info("Ürün sepetten silindi");
        methods.waitBySeconds(3);
    }

    public void controlEmptyBasket(){
        String controlBasket = methods.findElement(By.xpath("//p[@class='cart-empty-title']")).getText();
        Assert.assertEquals("Sepetinizde ürün bulunmamaktadır.",controlBasket);
        logger.info("Sepetin boş olduğu doğrulandı");
        methods.waitBySeconds(3);
    }

}
