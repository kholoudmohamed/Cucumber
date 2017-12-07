package Actions;

import Page_Objects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {
    public static void EnterUserNameAndPassword(WebDriver driver) throws Exception{
        LoginPage.UsernameTxt.sendKeys(System.getProperty("testuser.username"));
        LoginPage.PasswordTxt.sendKeys(System.getProperty("testuser.password"));

    }
    public static void ClickLogin(WebDriver driver) throws Exception{
        LoginPage.LoginBtn.click();

    }
}
