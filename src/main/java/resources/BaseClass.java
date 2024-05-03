package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;
    public Properties prop;
    public static Logger logger;
    public WebDriver initializeDriver() throws IOException {
        prop = new Properties();
        String propath = System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\data.properties";
        FileInputStream fis = new FileInputStream(propath);
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        logger = Logger.getLogger("Important");
        PropertyConfigurator.configure("log4j.properties");
        if (browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("ie"))
        {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;


    }
    public String takeScreenshot(String testName, WebDriver driver) throws IOException {
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
        FileUtils.copyFile(sourceFile, new File(destinationFilePath));
        return destinationFilePath;
    }
}

