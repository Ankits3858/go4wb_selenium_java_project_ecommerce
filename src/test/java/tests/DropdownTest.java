package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.LoginPage;
import resources.BaseClass;

import java.io.IOException;


public class DropdownTest extends BaseClass {
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
    public void dropdowntest()
    {
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

        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getAgriNFood().click();
        Assert.assertEquals("Agriculture Bags","Agriculture Bags");
        logger.info("Agriculture and food displaying menu successfully");
        dropdownPage.getCompNelectronics().click();
        Assert.assertEquals("Computer Software & Hardware","Computer Software & Hardware");
        logger.info("Computer and electronics displaying menu successfully");
        dropdownPage.getConstructionNhousehold().click();
        Assert.assertEquals("Aggregates","Aggregates");
        logger.info("Construction & Houshold displaying menu successfully");
        dropdownPage.getIndustrialNauto().click();
        Assert.assertEquals("Chemicals & Allied Products","Chemicals & Allied Products");
        logger.info("Industrial and Automotive displaying menu successfully");
        dropdownPage.getMiscellaneous().click();
        Assert.assertEquals("Anthracite Coal","Anthracite Coal");
        logger.info("Misc. displaying menu successfully");
        dropdownPage.getPersonalNentertainment().click();
        Assert.assertEquals("Air Bags","Air Bags");
        logger.info("Personal and entertainment displaying menu successfully");

        dropdownPage.getHelpDropdown().click();
        Assert.assertEquals("Your Feedback","Your Feedback");
        logger.info("Help dropdown displaying menu successfully");

        dropdownPage.getContactDropdown().click();
        Assert.assertEquals("Call Us","Call Us");
        logger.info("Contact dropdown displaying menu successfully");



        dropdownPage.getForBuyersDropdown().click();
        Assert.assertEquals("Buyer Dashboard","Buyer Dashboard");
        logger.info("For Buyers dropdown displaying menu successfully");

        dropdownPage.getProfileDropdownmenu().click();
        Assert.assertEquals("Do Not Disturb","Do Not Disturb");
        logger.info("user profile dropdown displaying menu successfully");

        dropdownPage.getForSuppliersDropdown().click();
        Assert.assertEquals("Display Your Products","Display Your Products");
        logger.info("For suppliers dropdown displaying menu successfully");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");

        dropdownPage.getLoadmoretext().click();
        dropdownPage.getLoadmoretext().click();

        logger.info("Load more text functionality working fine");
        logger.info("Dropdown test passed successfully");










    }
}
