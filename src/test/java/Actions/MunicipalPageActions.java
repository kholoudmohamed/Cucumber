package Actions;

import PageObjects.MunicipalPage;
import org.openqa.selenium.WebDriver;

public class MunicipalPageActions {
    public static void GoTo(WebDriver driver) throws Exception{
        driver.get(System.getProperty("base.url")+"/AAMWeb/BondOfferings/MunicipalSearch.aspx");
    }

    public static void ClickOn_TopSearchBtn(){
        MunicipalPage.TopSearchBtn.click();
    }

    public static void ClickOn_FirstDisplayedTrust(){
        MunicipalPage.TrustsList.get(0).click();
    }

    public static void ClickOn_PlaceOrder(){
        MunicipalPage.PlaceOrderBtn.click();
    }
}
