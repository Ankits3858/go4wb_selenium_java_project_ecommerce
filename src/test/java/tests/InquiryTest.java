package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.InquiryPage;
import pageobjects.LoginPage;
import pageobjects.SearchPage;
import resources.BaseClass;

import javax.imageio.ImageIO;
import java.io.IOException;

public class InquiryTest extends BaseClass {
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
    public void inquiryTest() throws InterruptedException {
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
        logger.info("product searched successfully");
        searchPage.getFindSuppliers().click();
        logger.info("suppliers for product found successfully");

        InquiryPage inquiryPage = new InquiryPage(driver);
        inquiryPage.getInquiry().click();
        logger.info("clicked on inquiry button successfully");
        inquiryPage.getMessageInquiry().sendKeys("Hello testing the products Hello testing the productsHello testing the products");
        logger.info("message field filled successfully");
        inquiryPage.getCompanyName().sendKeys("abc private limited");
        logger.info("company name entered succesfully");
        inquiryPage.getYourName().sendKeys("xyz");
        logger.info("name entered successfully");
        inquiryPage.getPhoneNumber().sendKeys("0000000000000");
        logger.info("phone number field filled successfully");
        Thread.sleep(10000);
        inquiryPage.getInquireNow().click();
        logger.info("inquire now button clicked successfully");
        Assert.assertEquals("Thanks. Your Inquiry has been sent","Thanks. Your Inquiry has been sent");
    }
}
