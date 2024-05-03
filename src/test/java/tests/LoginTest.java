package tests;


import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import resources.BaseClass;

import java.io.IOException;

public class LoginTest extends BaseClass {
    public WebDriver driver;


    @Test(dataProvider = "getlogindata")
    public void login(String email, String password, String expectedResult) throws IOException {



        LoginPage loginPage = new LoginPage(driver);
        logger.info("landed to login page successfully");
        loginPage.getEmail().sendKeys(email);
       logger.info("email address entered successfully");
        loginPage.getPassword().sendKeys(password);
        logger.info("password entered successfully");
        loginPage.getLoginButton().click();
        logger.info("successfully clicked on login button");
        String actualResult = null;
        try {

            if (loginPage.getAccountverification().isDisplayed());
            {actualResult = "Successful";}
           logger.info("account confirmed successfully");
        } catch (Exception e)
        { actualResult = "Failure";}
        Assert.assertEquals(actualResult,expectedResult);
        logger.info("login test got passed");




    }
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
    @DataProvider
    public Object[][] getlogindata() {
        Object[][] data = {{"aki7002", "Wyzen@2020", "Successful"}, {"dummy@test.com", "hbdhsa", "Failure"}};
        return data;
    }
}

