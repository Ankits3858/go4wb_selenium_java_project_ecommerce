package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import resources.BaseClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinksTest extends BaseClass {
    WebDriver driver;
    @BeforeMethod
    public void openApplication() throws IOException {

        driver = initializeDriver();
        logger.info("Browser got launched");
        driver.get(prop.getProperty("url"));
        logger.info("browser opened successfully");
    }

    @AfterMethod
    public void closure()
    {
        driver.close();
        logger.info("browser closed successfully");
    }

    @Test
            public void brokenlinksTest() throws MalformedURLException {
    LoginPage loginPage = new LoginPage(driver);
        logger.info("successfully landed to loginpage");
        loginPage.getEmail().sendKeys(prop.getProperty("email"));
        logger.info("email entered successfully");
        loginPage.getPassword().sendKeys(prop.getProperty("password"));
        logger.info("password entered successfully");
        loginPage.getLoginButton().click();
        logger.info("login button clicked succesfully");
        loginPage.getAccountverification().isDisplayed();
        logger.info("Account verified successfully");

        List<WebElement> links = driver.findElements(By.tagName("img"));
        System.out.println("Total links are " + links.size());

        int brokenlinks=0;

        for (WebElement element: links) {

            String url = element.getAttribute("src");	// By using "href" attribute, we could get the url of the requried link
            if(url == null || url.isEmpty())
            {
                System.out.println("URL is empty");
                continue;
            }
            URL link= new URL(url);

            try
            {
                HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();	// Create a connection using URL object (i.e., link)
                httpConn.connect(); // connect using connect method

                if (httpConn.getResponseCode() >= 400)
                {
                    System.out.println(httpConn.getResponseCode()+":"+url + " -> " + "is Broken Link");
                    brokenlinks++;
                }
                else
                {
                    System.out.println(httpConn.getResponseCode()+":"+url + " -> " + "Valid Link");
                }
            }
            catch(Exception e) {}

        }
        System.out.println("Number of broken links:"+brokenlinks);


    }
}
