package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InquiryPage {
    WebDriver driver;
    public  InquiryPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[6]/a[1]")
    WebElement Inquiry;
    public WebElement getInquiry()
    {
        return Inquiry;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[1]/textarea")
    WebElement MessageInquiry;
    public WebElement getMessageInquiry()
    {
        return MessageInquiry;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[2]/input")
    WebElement CompanyName;
    public WebElement getCompanyName()
    {
        return CompanyName;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[3]/input")
    WebElement YourName;
    public  WebElement getYourName()
    {
        return YourName;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[5]/input")
    WebElement PhoneNumber;
    public WebElement getPhoneNumber()
    {
        return PhoneNumber;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[8]/button")
    WebElement InquireNow;
    public WebElement getInquireNow()
    {
        return InquireNow;
    }


}
