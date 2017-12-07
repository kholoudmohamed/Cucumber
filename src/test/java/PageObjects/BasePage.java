package PageObjects;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    public static WebDriver driver;
    public static boolean bResult;

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        BasePage.bResult = true;
    }
}
