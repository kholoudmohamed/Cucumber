package Actions;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {
    public static void GoTo(WebDriver driver){
        System.out.println(System.getProperty("base.url")+"/publicsite/login");
        driver.get(System.getProperty("base.url")+"/publicsite/login");
    }
    public static void EnterUserNameAndPassword(){
        LoginPage.UsernameTxt.sendKeys(System.getProperty("testuser.username"));
        LoginPage.PasswordTxt.sendKeys(System.getProperty("testuser.password"));

    }
    public static void ClickLogin(){
        LoginPage.LoginBtn.click();

    }
}
