package pageobjects;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.PreparedStatement;

public class SignupPage {
    WebDriver driver;
    public SignupPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[1]/a/span[1]")
    WebElement SignIndropdown;
    public WebElement getSignIndropdown()
    {
        return SignIndropdown;
    }
    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[1]/ul/li[2]/a")
    WebElement join;
    public WebElement getJoin()
    {
        return join;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[2]/input")
    WebElement CompanyNameSignup;
    public WebElement getCompanyNameSignup()
    {
        return CompanyNameSignup;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[3]/textarea")
    WebElement iamAsupplierOF;
    public WebElement getIamAsupplierOF()
    {
        return iamAsupplierOF;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[4]/textarea")
    WebElement iamAbuyerOF;
    public WebElement getIamAbuyerOF()
    {
        return iamAbuyerOF;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[5]/textarea")
    WebElement TradeServices;
    public WebElement getTradeServices()
    {
        return TradeServices;
    }
   // Select primaryBusin = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[1]/div[1]/select[1]")));
   // primary
  //  public WebElement getPrimaryBusiness()
  //  {

    //    return PrimaryBusiness;
  //  }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[6]/div[2]/div/input")
    WebElement YearOfBusinessEstablishment;
    public WebElement getYearOfBusinessEstablishment()
    {
        return YearOfBusinessEstablishment;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[7]/div[1]/div/select")
    WebElement annualsales;
    public WebElement getAnnualsales()
    {
        return annualsales;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[7]/div[2]/div/input")
    WebElement CompanyCertifications;
    public WebElement getCompanyCertifications()
    {
        return CompanyCertifications;
    }
    @FindBy(xpath = "//input[@id='new_member_step1_username']")
    WebElement UserName;
    public WebElement getUserName()
    {
        return UserName;
    }
    @FindBy(xpath = "//input[@id='new_member_step1_designation']")
    WebElement Designation;
    public WebElement getDesignation()
    {
        return Designation;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[10]/textarea[1]")
    WebElement address;
    public WebElement getAddress()
    {
        return address;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[11]/div[1]/div[1]/input[1]")
    WebElement CityName;
    public WebElement getCityName()
    {
        return CityName;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[11]/div[2]/div/input")
    WebElement zipcode;
    public WebElement getZipcode()
    {
        return zipcode;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[12]/div[1]/div[1]/input[1]")
    WebElement state;
    public WebElement getState()
    {
        return state;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[12]/div[2]/div[1]/select[1]")
    WebElement selectcountry;
    public WebElement getSelectcountry()
    {
        return selectcountry;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[13]/input[1]")
    WebElement UserPhoneNumber;
    public WebElement getUserPhoneNumber()
    {
        return UserPhoneNumber;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[14]/input[1]")
    WebElement Useremail;
    public WebElement getUseremail()
    {
        return Useremail;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[15]/input[1]")
    WebElement HomePage;
    public WebElement getHomePage()
    {
        return HomePage;
    }


    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[17]/input[1]")
    WebElement Login;
    public WebElement getLogin()
    {
        return Login;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[19]/input[1]")
    WebElement userpassword;
    public WebElement getUserpassword()
    {
        return userpassword;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[20]/input[1]")
    WebElement confirmpassword;
    public WebElement getConfirmpassword()
    {
        return confirmpassword;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/div/form/div[22]/div[2]/button")
    WebElement clickOnSubmit;
    public WebElement getClickOnSubmit()
    {
        return clickOnSubmit;
    }











}
