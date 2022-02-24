package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_010 {

    public US_010(){  PageFactory.initElements(Driver.getDriver(),this);   }

    @FindBy (xpath="//span[.='Create a new account']")
    public WebElement createNewButton;

    @FindBy (xpath="//input[@id='UserName']")
    public WebElement createUsername;

    @FindBy (xpath="//input[@id='Password']")
    public WebElement createPassword;

    @FindBy (xpath="//input[@id='Email']")
    public WebElement createEmail;

    @FindBy (xpath="//input[@id='NameSurname']")
    public WebElement createFullName;

    @FindBy (xpath="//input[@id='PhoneNo']")
    public WebElement createPhone;

    @FindBy (xpath="//input[@id='SSN']")
    public WebElement createSSN;

    @FindBy (xpath="//input[@id='DrivingLicense']")
    public WebElement createDrivingLic;

    @FindBy (xpath="(//select[@class='form-control input-lg required'])[1]")
    public WebElement selectCountry;

    @FindBy (xpath="(//select[@class='form-control input-lg required'])[2]")
    public WebElement selectState;

    @FindBy (xpath="//input[@id='Address']")
    public WebElement createAddress;

    @FindBy (xpath="//input[@id='WorkingSector']")
    public WebElement createWorkingSector;

    @FindBy (xpath="//input[@id='BirthDate']")
    public WebElement createBithDate;

    @FindBy (xpath="//input[@id='btnSubmit']")
    public WebElement createSaveButton;

    @FindBy (xpath="//div[@class='bootbox-body']")
    public WebElement createUyariYazisi;

    @FindBy (xpath="//button[@class='btn btn-primary']")
    public WebElement createOKButonu;

    @FindBy (xpath = "(//a[@class='nav-link'])[2]")
    public WebElement roomsButton;

    @FindBy (xpath = "//h3[@class='heading mb-4']")
    public WebElement advancedReservationYazisi;



    // =================================== TC_03==========================================

    @FindBy (xpath="//input[@id='checkin_date']")
    public WebElement checkInDateButton;

    @FindBy (xpath="//input[@id='checkout_date']")
    public WebElement checkOutDateButton;

    @FindBy (xpath="//select[@name='IDRoomType']")
    public WebElement selectRooms;

    @FindBy (xpath="//select[@name='AdultCount']")
    public WebElement selectAdult;

    @FindBy (xpath="//select[@name='ChildrenCount']")
    public WebElement selectChildren;

    @FindBy (xpath="//input[@id='location']")
    public WebElement locationBox;

    @FindBy (xpath="(//div[@class='icon'])[1]")
    public WebElement icon;

    @FindBy (xpath="//input[@value='Search']")
    public WebElement searchButton;

    @FindBy (xpath = "(//a[@href='/RoomDetail/31'])[2]")
    public WebElement ilkAramaSonucuElement;

    @FindBy (xpath = "//input[@id='NameOnCreditCard']")
    public WebElement nameOfCreditCardElement;

    @FindBy (xpath = "//input[@id='CreditCardNumber']")
    public WebElement creditCardNumberElement;

    @FindBy (xpath = "//select[@name='CreditCardExpirationYear']")
    public WebElement selectcreditCardExpritionYear;

    @FindBy (xpath = "//select[@name='CreditCardExpirationMonth']")
    public WebElement selectcreditCardExpritionMonth;

    @FindBy (xpath = "//input[@id='CVV']")
    public WebElement cVVElement;

    @FindBy (xpath = " //textarea")
    public WebElement messageElement;

    @FindBy (xpath = "//input[@value='Book this room']")
    public WebElement bookThisRoomElement;

    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement successfullyTextElement;

    @FindBy (xpath = "//button[@data-bb-handler='ok']")
    public WebElement successfullyOkElement;

    @FindBy (xpath = "//a[@href='/profile/Reservations']")
    public WebElement reservationsButtonElement;

    @FindBy (xpath = "//td[.='Zumrut']")
    public WebElement zumrutYazisiElement;


    // =================================== TC_03==========================================

    @FindBy (xpath = "(//div[@class='row'])[2]")
    public WebElement rezervasyonYapilmazYazisiElement;

    @FindBy (xpath = "//a[@href='/account/logon?returnUrl=%2FRoomDetail%2F31']")
    public WebElement rezervasyonYapilmazSayfasıLogInButtonElement;

    @FindBy (xpath = "//h2[@class='mb-4']")
    public WebElement kullanıcGirisIleKontrolElement;

    // =================================== TC_07==========================================

    @FindBy (xpath = "(//tr//td[4])[1]")
    public WebElement RezEndDateElement;

    @FindBy (xpath="//a[@href='/Profile/ReservationDetail/2041']")
    public WebElement detailsButtonElement;

    // =================================== TC_08==========================================

    @FindBy (xpath = "//input[@id='EmailAddress']")
    public WebElement rezervasyonEmailButtonElement;





}
