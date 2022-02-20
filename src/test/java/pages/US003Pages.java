package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US003Pages {
    public US003Pages(){
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath="//*[@id=\"add-form\"]/div[4]/a/span")
    public WebElement createNewAccountButton;

    @FindBy (xpath="/html/body/section[1]/div/div/div[1]/div/h2")
    public WebElement registrationFromTextPage;

    @FindBy (xpath="//*[@id=\"UserName\"]")
    public WebElement registrationFromUsername;

    @FindBy (xpath="//*[@id=\"Password\"]")
    public WebElement registrationFromPassword;

    @FindBy (xpath="//*[@id=\"Email\"]")
    public WebElement registrationFromEmail;

    @FindBy (xpath="//*[@id=\"NameSurname\"]")
    public WebElement registrationFromFullName;

    @FindBy (xpath="//*[@id=\"PhoneNo\"]")
    public WebElement registrationFromPhoneNo;

    @FindBy (xpath="//*[@id=\"SSN\"]")
    public WebElement RegistrationFromSSN;

    @FindBy (xpath="//*[@id=\"DrivingLicense\"]")
    public WebElement registrationFromDriverLicence;

    @FindBy (xpath="//select[@id='IDCountry']")
    public WebElement registrationFromCountry;

    @FindBy (xpath="//select[@id='IDState']")
    public WebElement registrationFromState;

    @FindBy (xpath="//*[@id=\"Address\"]")
    public WebElement registrationFromAddress;

    @FindBy (xpath="//*[@id=\"WorkingSector\"]")
    public WebElement registrationFromWorkingSector;

    @FindBy (xpath="//*[@id=\"BirthDate\"]")
    public WebElement registrationFromBirthDate;

    @FindBy (xpath="//*[@id=\"btnSubmit\"]")
    public WebElement registrationFromSave;

    //div[@class='bootbox-body']
    // (//div[text()='User Data was inserted successfully'])[2]
    @FindBy (xpath="(//div[text()='User Data was inserted successfully'])[2]")
    public WebElement alertSavedMessage;

    //button[@class='btn btn-primary']
    //button[text()='OK']
    @FindBy (xpath="//button[text()='OK']")
    public WebElement alertMessageOk;

    //h2[text()='Profile Page']
    @FindBy (xpath="//h2[text()='Profile Page']")
    public WebElement profilePageText;

    @FindBy (xpath="//span[text()='Try again please']")
    public WebElement negativeLoginText;









}
