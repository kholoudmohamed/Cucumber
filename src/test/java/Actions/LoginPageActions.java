package Actions;

import PageObjects.LoginPage;
import Resources.configReader;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {
    private static configReader data = new configReader();

    public static void GoTo(WebDriver driver){

        driver.get(System.getProperty("base.url")+data.getLoginPageUrl());
    }
    public static void EnterUserNameAndPassword(String username, String password){
        LoginPage.UsernameTxt.sendKeys(username);
        LoginPage.PasswordTxt.sendKeys(password);
    }
    public static void ClickLogin(){
        LoginPage.LoginBtn.click();
    }
    public static String GetLoginErrorMessageTxt(){
        return LoginPage.LoginErrorMessage.getText();
    }
    public static boolean IsLoginErrorMessageDisplayed(){
        return LoginPage.LoginErrorMessage.isDisplayed();
    }
}
