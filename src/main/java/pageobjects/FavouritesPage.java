package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavouritesPage {
    WebDriver driver;
            public FavouritesPage(WebDriver driver)
            {
                this.driver = driver;
                PageFactory.initElements(driver,this);
            }
            @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[6]/a[2]")
            WebElement AddtoFavourites;
            public WebElement getAddtoFavourites()
            {
                return AddtoFavourites;
            }
    @FindBy(xpath = "/html/body/div[8]/div/div/div[3]/button[2]")
    WebElement AddtoFavouritesPopup;
    public WebElement getAddtoFavouritesPopup()
    {
        return AddtoFavouritesPopup;
    }

    @FindBy(xpath = "/html/body/nav/div/div[4]/ul/li[2]/ul/li[16]/a")
    WebElement GotoFavourites;
    public WebElement getGotoFavourites()
    {
        return GotoFavourites;
    }



    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[1]/h4/label/input")
    WebElement SelectAllFavourites;
    public WebElement getSelectAllFavourites()
    {
        return SelectAllFavourites;
    }
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/h4/a")
    WebElement RemoveSelected;
    public WebElement getRemoveSelected()
    {
        return RemoveSelected;
    }

    @FindBy(xpath = "/html/body/div[8]/div/div/div[3]/button")
    WebElement RemoveSelectedPopup;
    public WebElement getRemoveSelectedPopup()
    {
        return RemoveSelectedPopup;
    }


}
