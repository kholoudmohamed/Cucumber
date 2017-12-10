package Definitions;

import Actions.CorporatePageActions;
import Actions.MunicipalPageActions;
import PageObjects.CorporatePage;
import PageObjects.MunicipalPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FixedIncomePageStepDefinitions {
    public WebDriver driver;

    public FixedIncomePageStepDefinitions()
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

    @When("^I navigate to Corporate Search Page$")
    public void iNavigateToCorporateSearchPage() throws Throwable {
        CorporatePageActions.GoTo(driver);
    }

    @And("^I open the first displayed corporate trust$")
    public void iOpenTheFirstDisplayedCorporateTrust() throws Throwable {
        PageFactory.initElements(driver, CorporatePage.class);
        CorporatePageActions.ClickOn_FirstDisplayedTrust();
    }

}
