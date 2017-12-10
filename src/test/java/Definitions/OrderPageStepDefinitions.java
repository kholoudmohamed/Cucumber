package Definitions;

import Actions.CommonActions;
import Actions.OrderPageActions;
import PageObjects.OrderPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Data;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class OrderPageStepDefinitions {
    public WebDriver driver;

    public OrderPageStepDefinitions()
    {
        driver = Hook.driver;
    }
    @And("^I click review button$")
    public void iClickReviewButton() throws Throwable {
        PageFactory.initElements(driver, OrderPage.class);
        OrderPageActions.ClickOn_NextReviewAndSubmitBtn();
    }

    @And("^I click submit order button$")
    public void iClickSubmitOrderButton() throws Throwable {
        PageFactory.initElements(driver, OrderPage.class);
        OrderPageActions.ClickOn_SubmitOrderBtn();
    }

    @Then("^Municipal order should be placed successfully$")
    public void municipalOrderShouldBePlacedSuccessfully() throws Throwable {
        PageFactory.initElements(driver, OrderPage.class);
        Assert.assertTrue("Order confirmation window is not displayed",OrderPage.OrderConfirmationWindow.isDisplayed());
        Assert.assertTrue("Order number is not displayed",OrderPage.OrderNumber.isDisplayed());
        Assert.assertTrue("Order CUSIP is not displayed",OrderPage.CusipNumber.isDisplayed());
    }

    @And("^I Fill in the order information$")
    public void iFillInTheOrderInformation(DataTable table) throws Throwable {
        PageFactory.initElements(driver, OrderPage.class);

        // Create an array list
        List<OrderData> ordersData;
        ordersData=table.asList(OrderData.class);

        for (OrderData orderData : ordersData) {
            OrderPageActions.Select_ClearingAgentAs(orderData.clearingAgent);
            OrderPageActions.Select_AccountTypeAs(orderData.accountType);

            OrderPageActions.Enter_ReceivedByAs(orderData.receivedBy);
            OrderPageActions.Select_DiscreteAs(orderData.discrete);
            OrderPageActions.Select_SolicitedAs(orderData.solicited);
            OrderPageActions.Enter_ReceivedTimeAs(orderData.orderReceivedTimeHr,orderData.orderReceivedTimeMin);

            OrderPageActions.ClickOn_ChooseAccountLink();

            driver.switchTo().frame(OrderPage.AccountPopupFrameId());
            driver.switchTo().frame(OrderPage.AccountPopupInnerFrameId());
            try {
                CommonActions.wait_till_Visibility_of_Element(driver, By.id(OrderPage.FirstAccountInListId()),10);
                OrderPageActions.ClickOn_FirstAccountInList();
            }catch (Exception ex){
                OrderPageActions.AddNewAccount(orderData.newAccountName,orderData.newAccountNumber,orderData.newAccountState);
                CommonActions.wait_till_Visibility_of_Element(driver, By.id(OrderPage.SelectThisBtnId()),10);
                OrderPageActions.ClickOn_SelectThisBtn();
                driver.switchTo().defaultContent();
            }

        }
    }
}
