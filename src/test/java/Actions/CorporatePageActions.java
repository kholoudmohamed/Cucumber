package Actions;

import PageObjects.CorporatePage;
import org.openqa.selenium.WebDriver;

public class CorporatePageActions {
    public static void GoTo(WebDriver driver) throws Exception{
        driver.get(System.getProperty("base.url")+"/AAMWeb/BondOfferings/CorporateSearch.aspx");
    }

    public static void ClickOn_TopSearchBtn(){
        CorporatePage.TopSearchBtn.click();
    }

    public static void ClickOn_FirstDisplayedTrust(){
        CorporatePage.TrustsList.get(0).click();
    }

    public static void ClickOn_PlaceOrder(){
        CorporatePage.PlaceOrderBtn.click();
    }
}
