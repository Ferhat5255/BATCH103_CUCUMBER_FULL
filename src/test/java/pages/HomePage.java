package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement firstLogin;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logOutButton;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement OKButton;
}
