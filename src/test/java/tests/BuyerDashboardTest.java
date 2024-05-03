package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.BuyerDashboard;
import pageobjects.DropdownPage;
import pageobjects.LoginPage;
import resources.BaseClass;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

public class BuyerDashboardTest extends BaseClass {

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
    public void buyerdashboard() throws InterruptedException, AWTException {
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
        dropdownPage.getForBuyersDropdown().click();
        logger.info("Buyers dropdown clicked successfully");

        BuyerDashboard buyerDashboard =  new BuyerDashboard(driver);
        buyerDashboard.getBuyerDashboard().click();
        logger.info("clicked on buyer dashboard successfully");

        buyerDashboard.getPostNew().click();
        logger.info("successfully clicked on post new ");

        buyerDashboard.getCompanyNameBuyerDashboard().sendKeys("abc limited");
        logger.info("company name entered successfully");

        buyerDashboard.getProductUwantToBuy().sendKeys("apple");
        logger.info("product name entered successfully");

        buyerDashboard.getRequirementDetails().sendKeys("100MT of olive oil");
        logger.info("requirement details entered successfully");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");

        buyerDashboard.getNameBuyerDashboard().sendKeys("xyz");
        logger.info("name inside the buyerdashboard entered successfully");

        buyerDashboard.getAddressBuyerDashboard().sendKeys("hello delhi");
        logger.info("address inside the field entered successfully");

        buyerDashboard.getCitynameBuyerDashboard().sendKeys("okinava");
        logger.info("city name entered successfully");

        buyerDashboard.getPostalcodeBuyerDashboard().sendKeys("12345");
        logger.info("postal code entered successfully");

        buyerDashboard.getStateBuyerDashboard().sendKeys("japan");
        logger.info("state name entered successfully");

        Select country = new Select(buyerDashboard.getCountryBuyerDashboard());
        country.selectByVisibleText("Japan");
        logger.info("country japan selected successfully");
        js.executeScript("window.scrollBy(0,500)", "");

        buyerDashboard.getPhoneNumberBuyerDashboard().sendKeys("1234566");
        logger.info("phone number entered successfully");

        buyerDashboard.getEmailBuyerDashboard().sendKeys("abc@gmail.com");
        logger.info("email entered successfully");

        buyerDashboard.getHomepageBuyerDashboard().sendKeys("abcd");
        logger.info("details inside the homepage entered successfully");

        js.executeScript("window.scrollBy(0,1000)", "");

        Robot robot = new Robot();

        buyerDashboard.getRegionsBuyerDashboard().click();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        buyerDashboard.getRegionsBuyerDashboard().click();
        buyerDashboard.getRegionsellersBuyersDashboard().click();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        buyerDashboard.getRegionsellersBuyersDashboard().click();
        Thread.sleep(10000);
        buyerDashboard.getClickOnNextBuyerDashboard().click();
        logger.info("Click on next and submit");

    }

}
