package Definitions;

import Actions.LoginPageActions;
import PageObjects.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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
        LoginPageActions.EnterUserNameAndPassword();
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
        LoginPageActions.EnterUserNameAndPassword();
        LoginPageActions.ClickLogin();
    }
}
