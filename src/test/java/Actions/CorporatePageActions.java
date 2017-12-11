package Actions;

import PageObjects.CorporatePage;
import Resources.configReader;
import org.openqa.selenium.WebDriver;

public class CorporatePageActions {
    private static configReader data = new configReader();

    public static void GoTo(WebDriver driver) throws Exception{
        driver.get(System.getProperty("base.url")+data.getCorporateSearchPageUrl());
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
