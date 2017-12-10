package Actions;


import PageObjects.OrderPage;
import org.mockito.internal.matchers.Or;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderPageActions {
    public static void ClickOn_NextReviewAndSubmitBtn(){
        OrderPage.NextReviewAndSubmitBtn.click();
    }
    public static void ClickOn_SubmitOrderBtn(){
        OrderPage.SubmitOrderBtn.click();
    }

    // Filling Order Mandatory items
    public static void Select_ClearingAgentAs(String clearingAgent){
        Select drpDwn = new Select(OrderPage.ClearingAgentDrpDwn);
        drpDwn.selectByVisibleText(clearingAgent);
    }
    public static void Select_AccountTypeAs(String accountType){
        Select drpDwn = new Select(OrderPage.AccountTypeDrpDwn);
        drpDwn.selectByVisibleText(accountType);
    }
    public static void Enter_ReceivedByAs(String receivedBy){
        OrderPage.ReceivedByTxtBx.sendKeys(receivedBy);
    }
    public static void Select_DiscreteAs(String discrete){
        Select drpDwn = new Select(OrderPage.DiscreteDrpDwn);
        drpDwn.selectByVisibleText(discrete);
    }
    public static void Select_SolicitedAs(String solicited){
        Select drpDwn = new Select(OrderPage.SolicitedDrpDwn);
        drpDwn.selectByVisibleText(solicited);
    }
    public static void Enter_ReceivedTimeAs(String receivedTimeHr, String receivedTimeMin ){
        OrderPage.OrderRecTimeHrTxtBx.sendKeys(receivedTimeHr);
        OrderPage.OrderRecTimeMinTxtBx.sendKeys(receivedTimeMin);
    }

    // Add/Select New Account Popup Actions
    public static void ClickOn_ChooseAccountLink(){
        OrderPage.ChooseAccountLink.click();
    }
    public static void ClickOn_FirstAccountInList(){
        OrderPage.FirstAccountInList.click();
    }

    public static void AddNewAccount (String accountName, String accountNumber,String accountState) throws InterruptedException {
        OrderPage.AddNewAccountTab.click();

        //Thread.sleep(5000);
        OrderPage.NewAccountNameTxtBx.sendKeys(accountName);
        OrderPage.NewAccountNumberTxtBx.sendKeys(accountNumber);

        Select drpDwn = new Select(OrderPage.NewAccountStateDrpDwn);
        drpDwn.selectByVisibleText(accountState);

        OrderPage.AddNewAccountAddBtn.click();
    }

    public static void ClickOn_SelectThisBtn(){
        OrderPage.AddNewAccountSelectThisBtn.click();
    }
}
