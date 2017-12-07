package Step_Definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hook  {

    public static WebDriver driver;


    @Before
    public void InitializeTest()
    {
        String exePath = "src\\test\\java\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After
    public void TearDownTest()
    {
        driver.quit();
    }
}
