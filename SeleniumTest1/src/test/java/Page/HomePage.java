package Page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


import static Page.LocatorPage.controlHomePage;

public class HomePage {

    Methods methods;
    Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(){
        methods = new Methods();
    }

    public void controlHome(){
        try {
            String textHome = methods.findElement(controlHomePage).getText();
            Assert.assertEquals("Giriş Yap", textHome);
            logger.info("Ana sayfadasiniz");
        }catch (Exception e){
            logger.info("Ana sayfaya gidilemedi");
        }
    }
}
