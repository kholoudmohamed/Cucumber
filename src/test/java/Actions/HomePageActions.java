package Actions;

import Page_Objects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageActions {
    public static void GoTo(WebDriver driver) throws Exception{
        //System.out.println("URL is "+System.getProperty("base.url"));
        driver.get(System.getProperty("base.url"));
    }
    public static void ClickLoginFromHeader(WebDriver driver) throws Exception{
        HomePage.HeaderLoginBtn.click();
    }
    public static String GetLoggedInUserFirstName(WebDriver driver) throws Exception{
        return HomePage.HeaderUserFirstName.getText();
    }

}
