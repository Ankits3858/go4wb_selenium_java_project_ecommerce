package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CommonUtils {
    WebDriver driver;
    public CommonUtils(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



}
