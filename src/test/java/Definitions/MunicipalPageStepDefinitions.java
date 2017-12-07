package Definitions;

import Actions.MunicipalPageActions;
import PageObjects.MunicipalPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MunicipalPageStepDefinitions {
    public WebDriver driver;

    public MunicipalPageStepDefinitions()
    {
        driver = Hook.driver;
    }

    @When("^I navigate to Municipal Search Page$")
    public void iNavigateToMunicipalSearchPage() throws Throwable {
        MunicipalPageActions.GoTo(driver);
    }

    @And("^I click on Search Button$")
    public void iClickOnSearchButton() throws Throwable {
        PageFactory.initElements(driver, MunicipalPage.class);
        MunicipalPageActions.ClickOn_TopSearchBtn();
    }

    @And("^I open the first displayed municipal trust$")
    public void iOpenTheFirstDisplayedMunicipalTrust() throws Throwable {
        PageFactory.initElements(driver, MunicipalPage.class);
        MunicipalPageActions.ClickOn_FirstDisplayedTrust();
    }

    @And("^I click Place Order Button$")
    public void iClickPlaceOrderButton() throws Throwable {
        PageFactory.initElements(driver, MunicipalPage.class);
        MunicipalPageActions.ClickOn_PlaceOrder();
    }
}
