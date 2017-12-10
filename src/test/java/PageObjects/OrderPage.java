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
    // Buttons
    @FindBy(how = How.CSS,using = "[id*='_btnReviewBtm']")
    public static WebElement NextReviewAndSubmitBtn ;

    @FindBy(how = How.CSS,using = "[id*='_btnSubmitBtm']")
    public static WebElement SubmitOrderBtn ;

    // Order Mandatory fields
    @FindBy(how = How.CSS,using = "[id*='_ddlClearingAgent']")
    public static WebElement ClearingAgentDrpDwn ;

    @FindBy(how = How.CSS,using = "[id*='_ddlAccountType']")
    public static WebElement AccountTypeDrpDwn ;

    @FindBy(how = How.CSS,using = "[id*='_dlCustomers_txtOrderRcvdByEd_0']")
    public static WebElement ReceivedByTxtBx;

    @FindBy(how = How.CSS,using = "[id*='_dlCustomers_ddlDiscretionEd_0']")
    public static WebElement DiscreteDrpDwn ;

    @FindBy(how = How.CSS,using = "[id*='_dlCustomers_ddlSolicitedEd_0']")
    public static WebElement SolicitedDrpDwn ;

    @FindBy(how = How.CSS,using = "[id*='_dlCustomers_txtOrderRecHours_0']")
    public static WebElement OrderRecTimeHrTxtBx ;

    @FindBy(how = How.CSS,using = "[id*='_dlCustomers_txtOrderRecMin_0']")
    public static WebElement OrderRecTimeMinTxtBx ;

    // Select/Add New Account Popup
    @FindBy(how = How.CSS,using = "[id*='_dlCustomers_lbAccountNumber_0']")
    public static WebElement ChooseAccountLink ;

    @FindBy(how = How.ID,using = "frameContainer")
    public static WebElement SelectAccountPopup ;

    @FindBy(how = How.ID,using = "dgAccounts_ctl02_lbAccountName")
    public static WebElement FirstAccountInList ;

    @FindBy(how = How.ID,using = "lbAddNew")
    public static WebElement AddNewAccountTab ;

    @FindBy(how = How.ID,using = "txtAccountNameNew")
    public static WebElement NewAccountNameTxtBx ;

    @FindBy(how = How.ID,using = "txtAccountNumberNew")
    public static WebElement NewAccountNumberTxtBx ;

    @FindBy(how = How.ID,using = "ddlStateAdd")
    public static WebElement NewAccountStateDrpDwn ;

    @FindBy(how = How.ID,using = "btnSave")
    public static WebElement AddNewAccountAddBtn ;

    @FindBy(how = How.ID,using = "btnSelect")
    public static WebElement AddNewAccountSelectThisBtn ;

    public static  String AccountPopupFrameId(){
        return "frameContainer";
    }
    public static String AccountPopupInnerFrameId(){
        return "frameInnerContainer";
    }
    public static String FirstAccountInListId(){
        return "dgAccounts_ctl02_lbAccountName";
    }
    public static String SelectThisBtnId(){
        return "btnSelect";
    }

    // Order Confirmation window elements
    @FindBy(how = How.CSS,using = "[id*='_divSubmitted']")
    public static WebElement OrderConfirmationWindow ;

    @FindBy(how = How.CSS,using = "[id*='_lblOrderOrTradeNumber']")
    public static WebElement OrderNumber ;

    @FindBy(how = How.CSS,using = "[id*='_lblCusipSubmitted']")
    public static WebElement CusipNumber ;
}
