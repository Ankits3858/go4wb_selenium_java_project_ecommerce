package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;
    public PaymentPage(WebDriver driver)
    {
         this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath =  "/html/body/nav/div/div[4]/ul/li[2]/a/span[1]")
    WebElement profileDropDown;
    public WebElement getProfileDropDown()
    {
        return profileDropDown;
    }

    @FindBy (xpath = "/html/body/nav/div/div[4]/ul/li[2]/ul/li[11]/a")
    WebElement PremiumMembership;
    public WebElement getPremiumMembership()
    {
        return PremiumMembership;
    }
    @FindBy (xpath = "/html/body/div[4]/div/div/div[3]/div[1]/div[2]/div[10]/a/span")
    WebElement paymentinfo;
    public WebElement getPaymentinfo()
    {
        return paymentinfo;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/form/div[1]/div/div[1]")
    WebElement GoldMembershiptwelveMonths;
    public WebElement getGoldMembershiptwelveMonths()
    {
        return GoldMembershiptwelveMonths;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/form/div[1]/div/div[2]/div[1]")
    WebElement GoldMembershipSixMonths;
    public WebElement getGoldMembershipSixMonths()
    {
        return GoldMembershipSixMonths;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/form/div[1]/div/div[3]/div[1]")
    WebElement SilverMembershipSixMonths;
    public WebElement getSilverMembershipSixMonths()
    {
        return SilverMembershipSixMonths;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[2]/div[2]/div[1]/div[1]")
    WebElement DebitNCreditCardPaymentOption;
    public WebElement getDebitNCreditCardPaymentOption()
    {
        return DebitNCreditCardPaymentOption;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[1]")
    WebElement NetBankingPaymentOption;
    public WebElement getNetBankingPaymentOption()
    {
        return NetBankingPaymentOption;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[2]/div[2]/div[3]/div[1]")
    WebElement ElectronicFundTransferPaymentOption;
    public WebElement getElectronicFundTransferPaymentOption()
    {
        return ElectronicFundTransferPaymentOption;
    }
    @FindBy(css = ".site-btn.btn.btn-default.make-payment[data-paymode='CC']")
    WebElement makePaymentViaCreditNDebitCard;
    public WebElement getMakePaymentViaCreditNDebitCard()
    {
        return makePaymentViaCreditNDebitCard;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/button")
    WebElement makePaymentViaNetBanking;
    public WebElement getMakePaymentViaNetBanking()
    {
        return makePaymentViaNetBanking;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[3]/button")
    WebElement makePaymentViaElectronicFundTransfer;
    public WebElement getMakePaymentViaElectronicFundTransfer()
    {
        return makePaymentViaElectronicFundTransfer;
    }




}
