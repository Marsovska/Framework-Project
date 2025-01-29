package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameBox;
    @FindBy(id="txtPassword")
    public WebElement passwordBox;
    @FindBy(id="btnLogin")
    public WebElement loginButton;
    @FindBy(id="welcome")
    public WebElement welcomeMsg;

    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    public WebElement PIMTag;

    @FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
    public WebElement AddEmpTag;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='middleName']")
    public WebElement middleNameBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='employeeId']")
     public WebElement empIDBox;

    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@for='firstName']")
    public WebElement emptyFieldError;

    @FindBy(xpath = "//h1[text()='Dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//h1[text()='Personal Details']")
    public WebElement personalDetail;

    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }


}
