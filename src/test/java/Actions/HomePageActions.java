package Actions;

import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageActions {
    public static void GoTo(WebDriver driver){
        driver.get(System.getProperty("base.url"));
    }
    public static void ClickLoginFromHeader(){
        HomePage.HeaderLoginBtn.click();
    }
    public static String GetLoggedInUserFirstName(){
        return HomePage.HeaderUserFirstName.getText();
    }

}
