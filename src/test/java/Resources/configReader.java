package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
    private Properties pro;
    public configReader()
    {
        try {
            File source = new File ("src\\test\\java\\resources\\datafile.properties");
            FileInputStream input=new FileInputStream(source);
            pro=new Properties();
            pro.load(input);
        }catch(Exception exp) {
            System.out.println("Exception is: ---" + exp.getMessage());
        }
    }

    public String getBrowser(){
        return pro.getProperty("browser");
    }
    public String getChromeDriverPath(){
        return pro.getProperty("chromeDriverpath");
    }
    public String getFirefoxDriverPath(){
        return pro.getProperty("firefoxDriverpath");
    }
    public String getCorporateSearchPageUrl(){
        return pro.getProperty("corporateSearchPage");
    }
    public String getLoginPageUrl(){
        return pro.getProperty("loginPage");
    }
    public String getMunicipalPageUrl(){
        return pro.getProperty("municipalSearchPage");
    }
    public String getScreenSize(){
        return pro.getProperty("screenSize");
    }
    public String getScreenSizeHeight(){
        return pro.getProperty("screenSizeHeight");
    }
    public String getScreenSizeWidth(){
        return pro.getProperty("screenSizeWidth");
    }
}
