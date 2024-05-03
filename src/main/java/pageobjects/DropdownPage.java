package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {
    WebDriver driver;
    public DropdownPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div/ul/li[1]/a")
    WebElement AgriNFood;
    public WebElement getAgriNFood()
    {
        return AgriNFood;
    }
    @FindBy(xpath =  "/html/body/div[4]/div/div[1]/div/div/div/ul/li[2]/a")
    WebElement CompNelectronics;
    public WebElement getCompNelectronics()
    {
        return CompNelectronics;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div/ul/li[3]/a")
    WebElement ConstructionNhousehold;
    public WebElement getConstructionNhousehold()
    {
        return ConstructionNhousehold;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div/ul/li[4]/a")
    WebElement IndustrialNauto;
    public WebElement getIndustrialNauto()
    {
        return IndustrialNauto;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div/ul/li[5]/a")
    WebElement Miscellaneous;
    public WebElement getMiscellaneous()
    {
        return Miscellaneous;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div/div/div/ul/li[6]/a")
    WebElement PersonalNentertainment;
    public WebElement getPersonalNentertainment()
    {
        return PersonalNentertainment;
    }
    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[4]/a")
    WebElement ForBuyersDropdown;
    public WebElement getForBuyersDropdown()
    {
        return ForBuyersDropdown;
    }
    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[3]/a")
    WebElement ForSuppliersDropdown;
    public WebElement getForSuppliersDropdown()
    {
        return ForSuppliersDropdown;
    }

    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[2]/a/span[1]")
    WebElement profileDropdownmenu;
    public WebElement getProfileDropdownmenu()
    {
        return profileDropdownmenu;
    }
    @FindBy(xpath = "/html/body/nav/div/div[1]/ul/li[2]/a/span[1]")
    WebElement contactDropdown;
    public WebElement getContactDropdown()
    {
        return contactDropdown;
    }
    @FindBy(xpath = "/html/body/nav/div/div[1]/ul/li[1]/a")
    WebElement HelpDropdown;
    public WebElement getHelpDropdown()
    {
        return HelpDropdown;
    }

    @FindBy(xpath = "/html/body/div[5]/div[1]/div[2]/div[2]/div/div[1]/div[3]/i")
    WebElement Loadmoretext;
    public WebElement getLoadmoretext()
    {
        return Loadmoretext;
    }


}
