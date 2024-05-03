package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoDealMakrActiveDeals {
    WebDriver driver;
    public GoDealMakrActiveDeals(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "/html/body/div[6]/div[1]/div/div[4]/ul/li[1]/a/button[1]/span[1]")
    WebElement CategoryProduct;
    public WebElement getCategoryProduct()
    {
        return CategoryProduct;
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div/div[4]/ul/li[2]/a/button[1]/span[1]")
    WebElement StatusProduct;
    public WebElement getStatusProduct()
    {
        return StatusProduct;
    }


    @FindBy(xpath = "/html/body/div[6]/div[1]/div/div[4]/ul/div[2]/div[1]/input")
    WebElement SearchDeals;
    public WebElement getSearchDeals()
    {
        return SearchDeals;
    }



    @FindBy(xpath = "/html/body/div[6]/div[1]/div/div[4]/ul/div[2]/div[2]/button/i")
    WebElement ClickSearchDeals;
    public WebElement getClickSearchDeals()
    {
        return ClickSearchDeals;
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div/div[4]/ul/div[2]/div[3]/a")
    WebElement StartDeal;
    public WebElement getStartDeal()
    {
        return StartDeal;
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div[2]/form/div[2]/input")
    WebElement ProductName;
    public WebElement getStartdealProductName()
    {
        return ProductName;
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div[2]/form/div[3]/input")
    WebElement CompanyName;
    public WebElement getStartdealCompanyName()
    {
        return CompanyName;
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div[2]/form/div[4]/input")
    WebElement Name;
    public WebElement getstartdealOwnername()
    {
        return Name;
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div[2]/form/div[5]/input")
    WebElement email;
    public WebElement getstartdealEmail()
    {
        return email;
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div[2]/form/div[6]/input")
    WebElement phoneNumber;
    public WebElement getstartdealPhoneNumber()
    {
        return phoneNumber;
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div[2]/form/div[7]/textarea")
    WebElement RequirementsDetails;
    public WebElement getRequirementsDetails()
    {
        return RequirementsDetails;
    }

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div/div[2]/form/div[9]/button")
    WebElement StartYourDeal;
    public WebElement getStartYourDeal()
    {
        return StartYourDeal;
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div/div[4]/div[1]/div/div/table/tbody/tr[2]")
    WebElement JoinThisDeal;
    public WebElement getJoinThisDeal()
    {
        return  JoinThisDeal;
    }



}
