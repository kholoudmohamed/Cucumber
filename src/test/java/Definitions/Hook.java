package Definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import Resources.configReader;

public class Hook  {

    public static WebDriver driver;
    private configReader data = new configReader();

    @Before
    public void InitializeTest()
    {
        String browserName=data.getBrowser();
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", data.getChromeDriverPath());
            driver = new ChromeDriver();
        } else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", data.getFirefoxDriverPath());
            driver = new FirefoxDriver();
        }else {
            System.out.println("Invalid browser name from properties file");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        if (data.getScreenSize().equals("custom")){
            Dimension d = new Dimension(Integer.parseInt(data.getScreenSizeHeight()),Integer.parseInt(data.getScreenSizeWidth()));
            driver.manage().window().setSize(d);
        }else{
            driver.manage().window().maximize();
        }
    }
    @After
    public void TearDownTest()
    {
        driver.quit();
    }
}
