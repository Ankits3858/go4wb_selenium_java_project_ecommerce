package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.PaymentPage;
import resources.BaseClass;

import java.io.IOException;

public class PaymentTest extends BaseClass {
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
    public void paymentTest()
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


        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.getProfileDropDown().click();
        logger.info("successfully clicked on profile dropdown menu");
        paymentPage.getPremiumMembership().click();
        logger.info("successfully clicked on become a premium member");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        paymentPage.getPaymentinfo().click();
        logger.info("successfully clicked on get premium membership");

        paymentPage.getGoldMembershipSixMonths().click();
        Assert.assertEquals("Rs. 18879\n","Rs. 18879\n");
        logger.info("Gold membership gor 6 months selected successfully");
        paymentPage.getSilverMembershipSixMonths().click();
        Assert.assertEquals("Rs. 14159\n","Rs. 14159\n");
        logger.info("Silver membership gor 6 months selected successfully");
        paymentPage.getGoldMembershiptwelveMonths().click();
        Assert.assertEquals("Rs. 29499\n","Rs. 29499\n");
        logger.info("Gold membership gor 12 months selected successfully");


        js.executeScript("window.scrollBy(0,1000)", "");
        paymentPage.getDebitNCreditCardPaymentOption().click();
        Assert.assertEquals("We do not store your debit/credit card information","We do not store your debit/credit card information");

        js.executeScript("window.scrollBy(0,1000)", "");
        paymentPage.getMakePaymentViaCreditNDebitCard().click();
        Assert.assertEquals("Pay with card","Pay with card");
        logger.info("payment via debit/credit card working fine");
        driver.navigate().back();
        js.executeScript("window.scrollBy(0,1000)", "");
        paymentPage.getNetBankingPaymentOption().click();
        Assert.assertEquals("Your Email Address","Your Email Address");
        paymentPage.getMakePaymentViaNetBanking().click();
        Assert.assertEquals("Billing Information","Billing Information");
        logger.info("payment via NetBankning working fine");
        driver.navigate().back();
        paymentPage.getElectronicFundTransferPaymentOption().click();
        Assert.assertEquals("Phone Number","Phone Number");
        paymentPage.getMakePaymentViaElectronicFundTransfer().click();
        Assert.assertEquals("Your payment status","Your payment status");
        logger.info("payment via Electronic fund Transfer working fine");



        logger.info("Payment Test passed successfully");
    }

}
