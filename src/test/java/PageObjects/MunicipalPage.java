package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MunicipalPage extends BasePage {
    public MunicipalPage(WebDriver driver){
        super(driver);
    }
    //locators
    @FindBy(how = How.CSS,using = "[id*='_btnSearchTop']")
    public static WebElement TopSearchBtn ;

    @FindBy(how = How.CSS,using = "[id*='_grdResults_ctl00__']> td:nth-child(3)")
    public static List<WebElement> TrustsList ;

    @FindBy(how = How.ID,using = "body_BondDetailHeader_placeOrderButton")
    public static WebElement PlaceOrderBtn ;


}