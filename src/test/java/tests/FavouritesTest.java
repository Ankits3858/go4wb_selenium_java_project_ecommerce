package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.DropdownPage;
import pageobjects.FavouritesPage;
import pageobjects.LoginPage;
import pageobjects.SearchPage;
import resources.BaseClass;

import java.io.IOException;

public class FavouritesTest extends BaseClass {
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
    public void favouritestest()
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
        searchPage.getFindSuppliers().click();

        FavouritesPage favouritesPage = new FavouritesPage(driver);
        favouritesPage.getAddtoFavourites().click();
        logger.info("product added to favourites successfully");
        favouritesPage.getAddtoFavouritesPopup().click();

        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.getProfileDropdownmenu().click();
        logger.info("user profile dropdown clicked successfully");
        Assert.assertEquals("1","1");
        logger.info("number of products adding to favourites displayed '1' successfully in profile dropdown menu");

        favouritesPage.getGotoFavourites().click();
        logger.info("landed to favourites list successfully");
        favouritesPage.getSelectAllFavourites().click();
        logger.info("all products selected successfully");
        favouritesPage.getRemoveSelected().click();
        logger.info("selected products removed successfully");
        favouritesPage.getRemoveSelectedPopup().click();
        dropdownPage.getProfileDropdownmenu().click();
        Assert.assertEquals("0","0");
        logger.info("number of products removing from favourites displayed '0' successfully in profile dropdown menu");
        logger.info("adding and removing products to favourites working fine");




    }
}
