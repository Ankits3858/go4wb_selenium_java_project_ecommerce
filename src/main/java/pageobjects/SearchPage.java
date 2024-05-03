package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[placeholder='Find Worldwide Buyers, Suppliers and Products']")
    WebElement SearchBar;
    public WebElement getSearchBar()
    {
        return SearchBar;
    }
    @FindBy(xpath = "//button[@id='FindSuppliers']")
    WebElement FindSuppliers;
    public WebElement getFindSuppliers()
    {
        return FindSuppliers;
    }
    @FindBy(xpath = "//button[@id='FindBuyers']")
    WebElement FindBuyers;
    public WebElement getFindBuyers()
    {
        return FindBuyers;
    }
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/ul/div/form/span[1]/div/div/button/p")
    WebElement CountriesFilter;
    public WebElement getCountriesFilter()
    {
        return CountriesFilter;
    }
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/ul/div/form/span[2]/div/div/button/p")
    WebElement PremiumMembersFilter;
    public WebElement getPremiumMembersFilter()
    {
        return PremiumMembersFilter;
    }
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/ul/div/form/span[3]/div/div/button/p")
    WebElement ListingTypeFilter;
    public WebElement getListingTypeFilter()
    {
        return ListingTypeFilter;
    }
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/ul/div/form/span[4]/div/div/button/p")
    WebElement DateFilter;
    public WebElement getDateFilter()
    {
        return DateFilter;
    }


}
