package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import pageobjects.SignupPage;
import resources.BaseClass;

import java.io.IOException;

public class SignupTest extends BaseClass {
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
    public void signuptest() throws InterruptedException {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.getSignIndropdown().click();

        signupPage.getJoin().click();
        logger.info("landed to signup page successfully");
        signupPage.getCompanyNameSignup().sendKeys("ABCD private limited");
        logger.info("company name entered successfully");
        signupPage.getIamAsupplierOF().sendKeys("Fruits and vegetables");
        logger.info("i am supplier of ---field working successfully");
        signupPage.getIamAbuyerOF().sendKeys("Fruits and vegetables");
        logger.info("i am buyers of--- field working successfully");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        signupPage.getTradeServices().sendKeys("Fruits and vegetables");
        logger.info("Trade services field working successfully");

        Select primaryBusiness = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/select[1]")));
        primaryBusiness.selectByVisibleText("Buying Agent");
        logger.info("primary business dropdown working successfully");

        signupPage.getYearOfBusinessEstablishment().sendKeys("2000");
        logger.info("year of business establishment working successfully");
        signupPage.getCompanyCertifications().sendKeys("iso98939");
        logger.info("company certification field working successfully");

        Select annualSales = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/select[1]")));
        annualSales.selectByVisibleText("Upto 250,000 USD");
        logger.info("Annual sales dropdown menu working successfully");
        js.executeScript("window.scrollBy(0,500)", "");

        signupPage.getUserName().sendKeys("xyz");
        logger.info("name of new member entered successfully");
        signupPage.getDesignation().sendKeys("CEO");
        logger.info("Designation of new member entered successfully");
        signupPage.getAddress().sendKeys("toronto canada");
        logger.info("address of new member entered successfully");
        signupPage.getCityName().sendKeys("okhla");
        logger.info("Cityname of new member entered successfully");
        signupPage.getState().sendKeys("Delhi");
        logger.info("State name of new member entered successfully");
        signupPage.getZipcode().sendKeys("110034");
        logger.info("Zipcode of new member entered successfully");

        Select country = new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[12]/div[2]/div/select")));
        country.selectByVisibleText("India");
        logger.info("country dropdown menu working successfully");
        js.executeScript("window.scrollBy(0,500)", "");

        signupPage.getUserPhoneNumber().sendKeys("+174893594759");
        logger.info("phone number of new member entered successfully");
        signupPage.getUseremail().sendKeys("xyv@gmail.com");
        logger.info("email of new member entered successfully");
        signupPage.getHomePage().sendKeys("abcdefgh");
        logger.info("Homepage address of new member entered successfully");
        js.executeScript("window.scrollBy(0,1000)", "");
        signupPage.getLogin().sendKeys("seller2984791479");
        logger.info("Login credentials of new member entered successfully");
        signupPage.getUserpassword().sendKeys("okhla123");
        logger.info("password of new member entered successfully");
        signupPage.getConfirmpassword().sendKeys("okhla123");
        logger.info("password of new member verified successfully");
        Thread.sleep(10000);
        signupPage.getClickOnSubmit().click();
        logger.info("final submit button working successfully");
        logger.info("signup test verified successfully");










    }
}
