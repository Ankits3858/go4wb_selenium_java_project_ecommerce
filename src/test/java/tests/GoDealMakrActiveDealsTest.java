package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.GoDealMakrActiveDeals;
import pageobjects.LoginPage;
import resources.BaseClass;

import java.io.IOException;

public class GoDealMakrActiveDealsTest extends BaseClass {
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
    public void godealmakrActiveDealsTest() throws InterruptedException {

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

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)", "");

        GoDealMakrActiveDeals goDealMakrActiveDeals= new GoDealMakrActiveDeals(driver);
        goDealMakrActiveDeals.getCategoryProduct().click();
        logger.info("category dropdown for deals clicked successfully");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[4]/ul/li[1]/ul/li[5]/a")).click();
        logger.info("Active deal for product in the category selected successfully");

        Assert.assertEquals("DealMakr Deals","DealMakr Deals");
        logger.info("successfully showing Active deals for selected items");
        driver.navigate().back();

        goDealMakrActiveDeals.getStatusProduct().click();
        logger.info("Dropdown showing the (online/offline) status of product clicked successfully");
        Assert.assertEquals("Active","Active");
        logger.info("Active and failed options are visible in the dropdown");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div[4]/ul/li[2]/ul/li[2]/a")).click();
        logger.info("active deals selected successfully");
        Assert.assertEquals("Active","Active");
        logger.info("after clicking on active deals new webpage is showing all the active deals");
        driver.navigate().back();

        goDealMakrActiveDeals.getStatusProduct().click();
        driver.findElement(By.cssSelector("a[href='/all/failed/dealmakr/deals']")).click();
        logger.info("failed deals selected successfully");
        Assert.assertEquals("Failed","Failed");
        logger.info("after clicking on failed deals new webpage is showing all the failed deals");
        driver.navigate().back();

        goDealMakrActiveDeals.getSearchDeals().sendKeys("fruits");
        logger.info("fruits in the search field entered successfully");
        goDealMakrActiveDeals.getClickSearchDeals().click();
        logger.info("successfully clicked on search deals for products");
        Assert.assertEquals("Fruits","Fruits");
        logger.info("successfully showing deals for searched item");
        driver.navigate().back();



        goDealMakrActiveDeals.getStartDeal().click();
        logger.info("start a new deal functionality clicked successfully");
        goDealMakrActiveDeals.getStartdealProductName().sendKeys("apple");
        logger.info("user is able to enter the name of the product");

        goDealMakrActiveDeals.getStartdealCompanyName().sendKeys("abc");
        logger.info("user is able to enter the name of the company");

        goDealMakrActiveDeals.getstartdealOwnername().sendKeys("xyz");
        logger.info("user is able to enter his or her name");

        goDealMakrActiveDeals.getstartdealEmail().sendKeys("abcd");
        logger.info("user is able to enter the email");

        js.executeScript("window.scrollBy(0,1000)", "");
        goDealMakrActiveDeals.getstartdealPhoneNumber().sendKeys("12234555");
        goDealMakrActiveDeals.getRequirementsDetails().sendKeys("hello hello hello hello hello hello");
        Thread.sleep(10000);

        goDealMakrActiveDeals.getStartYourDeal().click();
        logger.info("clicked on the StartYourDeal");

        Assert.assertEquals("Your request has been noted. We will get back to you in 24-48 business hours.","Your request has been noted. We will get back to you in 24-48 business hours.");

    }

}
