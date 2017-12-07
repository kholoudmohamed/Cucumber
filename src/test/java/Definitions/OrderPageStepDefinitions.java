package Definitions;

import Actions.OrderPageActions;
import PageObjects.OrderPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
}
