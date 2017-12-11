package Actions;

import PageObjects.LoginPage;
import Resources.configReader;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {
    private static configReader data = new configReader();

    public static void GoTo(WebDriver driver){

        driver.get(System.getProperty("base.url")+data.getLoginPageUrl());
    }
    public static void EnterUserNameAndPassword(){
        LoginPage.UsernameTxt.sendKeys(System.getProperty("testuser.username"));
        LoginPage.PasswordTxt.sendKeys(System.getProperty("testuser.password"));

    }
    public static void ClickLogin(){
        LoginPage.LoginBtn.click();

    }
}
