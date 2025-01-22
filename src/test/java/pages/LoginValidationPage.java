package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginValidationPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameBox;

    @FindBy(id="txtPassword")
    public WebElement passwordBox;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    @FindBy(id="spanMessage")
     public WebElement automatedErrorMessage;
    @FindBy(id="welcome")
    public WebElement welcomeMsg;


    public LoginValidationPage(){
        PageFactory.initElements(driver, this);
    }

    public String getAutomatedErrorMessage(){
        return automatedErrorMessage.getText().toString();
    }
    public String getWelcomeMessage(){
        return welcomeMsg.getText().toString();
    }
}
