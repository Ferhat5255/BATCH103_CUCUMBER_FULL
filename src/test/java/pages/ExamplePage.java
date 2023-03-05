package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExamplePage {
   public ExamplePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy(xpath = "//a[@href='/login']") public WebElement buttonLogin;
   @FindBy(id = "formBasicEmail") public WebElement boxEmail;
   @FindBy(id = "formBasicPassword") public WebElement boxPassword;
   @FindBy(xpath = "//button[.=' Login']") public WebElement buttonLoginRegister;
   @FindBy(id="dropdown-basic-button") public WebElement buttonDropDown;
}
