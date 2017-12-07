package Step_Definitions;

import Actions.HomePageActions;
import Actions.LoginPageActions;
import Page_Objects.HomePage;
import Page_Objects.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginStepDefinition {
    public WebDriver driver;

    public LoginStepDefinition()
    {
        driver = Hook.driver;
    }


    @Given("^I navigated to the Home Page$")
    public void iNavigatedToTheHomePage() throws Throwable {
        HomePageActions.GoTo(driver);

    }

    @When("^I go to the login page$")
    public void iGoToTheLoginPage() throws Throwable {
        PageFactory.initElements(driver, HomePage.class);
        HomePageActions.ClickLoginFromHeader(driver);

    }

    @And("^Enter valid username and password$")
    public void enterValidUsernameAndPassword() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.EnterUserNameAndPassword(driver);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickLogin(driver);

    }

    @Then("^I should be directed to private Home Page$")
    public void iShouldBeDirectedToPrivateHomePage() throws Throwable {
        Assert.assertTrue("User is not logged in", driver.getCurrentUrl().contains("/AdvisorDashboard/Home/Index")||driver.getCurrentUrl().contains("/privatesite/aamhome"));

    }

    @And("^My first name should be displayed at the header$")
    public void myFirstNameShouldBeDisplayedAtTheHeader() throws Throwable {
        PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals("Username is not displayed correctly","TEST TRADER TEST TRADER", HomePageActions.GetLoggedInUserFirstName(driver));

    }



}
