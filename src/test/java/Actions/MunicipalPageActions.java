package Actions;

import PageObjects.MunicipalPage;
import Resources.configReader;
import org.openqa.selenium.WebDriver;

public class MunicipalPageActions {
    private static configReader data = new configReader();

    public static void GoTo(WebDriver driver) throws Exception{
        driver.get(System.getProperty("base.url")+data.getMunicipalPageUrl());
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
