package Page;

import com.testinium.methods.Methods;
import org.junit.Assert;


import static Page.LocatorPage.*;

public class LoginPage {
    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.click(login);
        methods.waitBySeconds(3);
        methods.sendKeys(email,"orhunyildirim1@gmail.com");
        methods.waitBySeconds(3);
        methods.sendKeys(password,"139931kral");
        methods.waitBySeconds(3);
        methods.click(loginButton);
        methods.waitBySeconds(3);
    }

    public void controlLogin(){
        String controlLog = methods.findElement(controlLoginPage).getText();
        Assert.assertEquals("Hesabım",controlLog);
        methods.waitBySeconds(3);
    }
}
