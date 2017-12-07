package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    //locators
    @FindBy(how = How.CSS,using = "[id*='_uxLoginLink']")
    public static WebElement HeaderLoginBtn ;

    @FindBy(how = How.CSS,using = "[id*='_lblGreeting']")
    public static WebElement HeaderUserFirstName ;

}
