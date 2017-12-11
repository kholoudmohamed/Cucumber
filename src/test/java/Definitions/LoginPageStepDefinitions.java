package Definitions;

import Actions.LoginPageActions;
import PageObjects.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginPageStepDefinitions {
    public WebDriver driver;

    public LoginPageStepDefinitions()
    {
        driver = Hook.driver;
    }

    @And("^Enter valid username and password$")
    public void enterValidUsernameAndPassword() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.EnterUserNameAndPassword(System.getProperty("testuser.username"),System.getProperty("testuser.password"));
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.ClickLogin();

    }

    @Given("^I navigated to the Login Page$")
    public void iNavigatedToTheLoginPage() throws Throwable {
        LoginPageActions.GoTo(driver);
    }

    @And("^Logged in with valid username and password$")
    public void loggedInWithValidUsernameAndPassword() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.EnterUserNameAndPassword(System.getProperty("testuser.username"),System.getProperty("testuser.password"));
        LoginPageActions.ClickLogin();
    }

    @And("^Enter invalid username and password$")
    public void enterInvalidUsernameAndPassword() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.EnterUserNameAndPassword("invalid","invalid");
    }

    @Then("^Invalid username or password error message should be displayed$")
    public void invalidUsernameOrPasswordErrorMessageShouldBeDisplayed() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Assert.assertTrue("Login Error Message is not displayed",LoginPageActions.IsLoginErrorMessageDisplayed());
    }

    @And("^Error message text should be \"([^\"]*)\"$")
    public void errorMessageTextShouldBe(String errorMessage) throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        Assert.assertEquals("Login Error Message text is not correct",errorMessage,LoginPageActions.GetLoginErrorMessageTxt());
    }

    @And("^Enter invalid email and password$")
    public void enterInvalidEmailAndPassword() throws Throwable {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPageActions.EnterUserNameAndPassword("invalid@aam.com","invalid");
    }
}
