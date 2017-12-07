package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }
    //locators
    @FindBy(how = How.CSS,using = "[id*='_btnReviewBtm']")
    public static WebElement NextReviewAndSubmitBtn ;

    @FindBy(how = How.CSS,using = "[id*='_btnSubmitBtm']")
    public static WebElement SubmitOrderBtn ;

    @FindBy(how = How.CSS,using = "[id*='_divSubmitted']")
    public static WebElement OrderConfirmationWindow ;

    @FindBy(how = How.CSS,using = "[id*='_lblOrderOrTradeNumber']")
    public static WebElement OrderNumber ;

    @FindBy(how = How.CSS,using = "[id*='_lblCusipSubmitted']")
    public static WebElement CusipNumber ;
}
