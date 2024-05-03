package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.SearchPage;
import resources.BaseClass;

import java.io.IOException;

public class SearchTest extends BaseClass {
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
    public void searchTest()
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

        SearchPage searchPage= new SearchPage(driver);

        searchPage.getSearchBar().sendKeys("go4worldbusiness.com");
        logger.info("input entered in searchbar successfully");
        searchPage.getFindBuyers().click();
        Assert.assertEquals("Go4Worldbusiness.com Buyers and Buying Leads","Go4Worldbusiness.com Buyers and Buying Leads");
        logger.info("find buyers via searching working successfully");
        searchPage.getFindSuppliers().click();
        Assert.assertEquals("Go4Worldbusiness.com Suppliers and Manufacturers","Go4Worldbusiness.com Suppliers and Manufacturers");
        logger.info("find sellers via searching working successfully");
        searchPage.getCountriesFilter().click();
        Assert.assertEquals("Top 20 Countries","Top 20 Countries");
        logger.info("countries filter working fine");
        searchPage.getPremiumMembersFilter().click();
        Assert.assertEquals("Gold Preffered","Gold Preffered");
        logger.info("premium membership filter working fine");
        searchPage.getListingTypeFilter().click();
        Assert.assertEquals("Trade Leads","Trade Leads");
        logger.info("Listing type filter working fine");

        searchPage.getDateFilter().click();
        Assert.assertEquals("Last 3 Days","Last 3 Days");
        logger.info("Date filter working fine");
        logger.info("Search test got passed successfully");

    }
}
