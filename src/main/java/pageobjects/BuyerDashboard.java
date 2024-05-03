package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyerDashboard {
    WebDriver driver;
    public BuyerDashboard(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[4]/ul/li[1]/a")
    WebElement BuyerDashboard;
    public WebElement getBuyerDashboard()
    {
        return BuyerDashboard;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/h2/a")
    WebElement PostNew;
    public WebElement getPostNew()
    {
        return PostNew;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[2]/input")
    WebElement CompanyNameBuyerDashboard;
    public WebElement getCompanyNameBuyerDashboard()
    {
        return CompanyNameBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[3]/input")
    WebElement ProductUwantToBuy;
    public WebElement getProductUwantToBuy()
    {
        return ProductUwantToBuy;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[4]/textarea")
    WebElement RequirementDetails;
    public WebElement getRequirementDetails()
    {
        return RequirementDetails;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[6]/input")
    WebElement nameBuyerDashboard;
    public WebElement getNameBuyerDashboard()
    {
        return nameBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[7]/textarea")
    WebElement addressBuyerDashboard;
    public WebElement getAddressBuyerDashboard()
    {
        return addressBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[8]/div[1]/div/input")
    WebElement CitynameBuyerDashboard;
    public WebElement getCitynameBuyerDashboard()
    {
        return CitynameBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[8]/div[2]/div/input")
    WebElement postalcodeBuyerDashboard;
    public WebElement getPostalcodeBuyerDashboard()
    {
        return postalcodeBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[9]/div[1]/div/input")
    WebElement StateBuyerDashboard;
    public WebElement getStateBuyerDashboard()
    {
        return StateBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[9]/div[2]/div/select")
    WebElement CountryBuyerDashboard;
    public WebElement getCountryBuyerDashboard()
    {
        return CountryBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[10]/input")
    WebElement PhoneNumberBuyerDashboard;
    public WebElement getPhoneNumberBuyerDashboard()
    {
        return PhoneNumberBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[11]/input")
    WebElement EmailBuyerDashboard;
    public WebElement getEmailBuyerDashboard()
    {
        return EmailBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[12]/input")
    WebElement HomepageBuyerDashboard;
    public WebElement getHomepageBuyerDashboard()
    {
        return HomepageBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[13]/div/div[1]/div/div")
    WebElement RegionsBuyerDashboard;
    public WebElement getRegionsBuyerDashboard()
    {
        return RegionsBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[15]/div[2]/button")
    WebElement ClickOnNextBuyerDashboard;
    public WebElement getClickOnNextBuyerDashboard()
    {
        return ClickOnNextBuyerDashboard;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[3]/div/div/div/div/div/form/div[13]/div/div[2]/div/div/div")
    WebElement RegionsellersBuyersDashboard;
    public WebElement getRegionsellersBuyersDashboard()
    {
        return RegionsellersBuyersDashboard;
    }


    






}
