package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginPage extends CommonMethods {

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"j_page_header\"]/div[1]/div/div[1]/div[1]/div[2]/div[3]/div[1]/input")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"j_page_header\"]/div[1]/div/div[1]/div[1]/div[2]/div[3]/div[1]/butto")
    public WebElement loginButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]")
    public WebElement myAccount;

    public void enterUserName() {sendText (ConfigReader.read("username"), usernameField);}
    public void enterPassword() {sendText (ConfigReader.read("password"), passwordField);}
    public void clickLoginButton(){click (login.loginButton);}

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

}
