package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

        // Locators
    @FindBy(how = How.ID,using = "C003_txtLoginName")
    public static WebElement UsernameTxt ;

    @FindBy(how = How.ID,using = "C003_txtPassword")
    public static WebElement PasswordTxt ;

    @FindBy(how = How.ID,using = "C003_btnLogin")
    public static WebElement LoginBtn ;

    @FindBy(how = How.CSS,using = ".login-error.AAMWeb_loginForm_Label")
    public static WebElement LoginErrorMessage ;

}
