package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[1]/div/div[2]/input")
    WebElement email;

    public WebElement getEmail() {
        return email;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[2]/div/div[2]/input")
    WebElement password;
    public WebElement getPassword()
    {
        return password;
    }
    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[5]/div/div/button")
    WebElement loginButton;
    public WebElement getLoginButton()
    {
        return loginButton;
    }
    @FindBy(linkText = "Agriculture and Food")
    WebElement Accountverification;
    public WebElement getAccountverification()
    {
        return Accountverification;
    }


}
