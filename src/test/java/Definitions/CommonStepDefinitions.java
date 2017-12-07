package Definitions;

import Actions.HomePageActions;
import PageObjects.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonStepDefinitions {
    public WebDriver driver;

    public CommonStepDefinitions()
    {
        driver = Hook.driver;
    }

    @Given("^I navigated to the Home Page$")
    public void iNavigatedToTheHomePage() throws Throwable {
        HomePageActions.GoTo(driver);

    }

    @When("^I go to the login page from header$")
    public void iGoToTheLoginPage() throws Throwable {
        PageFactory.initElements(driver, HomePage.class);
        HomePageActions.ClickLoginFromHeader();

    }
    @Then("^I should be directed to private Home Page$")
    public void iShouldBeDirectedToPrivateHomePage() throws Throwable {
        Assert.assertTrue("User is not logged in", driver.getCurrentUrl().contains("/AdvisorDashboard/Home/Index")||driver.getCurrentUrl().contains("/privatesite/aamhome"));

    }

    @And("^My first name should be displayed at the header$")
    public void myFirstNameShouldBeDisplayedAtTheHeader() throws Throwable {
        PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals("Username is not displayed correctly","TEST TRADER TEST TRADER", HomePageActions.GetLoggedInUserFirstName());

    }
}
