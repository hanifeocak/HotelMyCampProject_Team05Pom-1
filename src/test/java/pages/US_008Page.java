package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_008Page {

    public US_008Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement firstLogInElement;

    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement userNameBoxElement;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement passwordBoxElement;

    @FindBy(xpath = "(//input[@id='btnSubmit'])[1]")
    public WebElement secondLogInElement;

    @FindBy(xpath ="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy (xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziTesti;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "//a[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservationsButton;

    @FindBy(xpath = "//a[text()='List Of Reservations']")
    public WebElement listOfReservationsYazisi;

    @FindBy(xpath = "//span[text()='Add Room Reservation ']")
    public WebElement addRoomReservationButton;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelRoomreservationYazisi;

    @FindBy(xpath = "//select[@id='IDUser']")
    public WebElement idUser1DropdownElementi;

    @FindBy(xpath = "//select[@id='IDHotelRoom']")
    public WebElement idUser2DropdownElementi;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement priceTextBox;

    @FindBy(xpath = "//input[@id='DateStart']")
    public WebElement dateStartBox;

    @FindBy(xpath = "//input[@id='DateEnd']")
    public WebElement dateEndBox;

    @FindBy(xpath = "//input[@id='AdultAmount']")
    public WebElement adultAmountBox;

    @FindBy(xpath = "//input[@id='ChildrenAmount']")
    public WebElement childrenAmountBox;

    @FindBy(xpath = "//input[@id='ContactNameSurname']")
    public WebElement contactNameSurnameBox;

    @FindBy(xpath = "//input[@id='ContactPhone']")
    public WebElement contactPhoneBox;

    @FindBy(xpath = "//input[@id='ContactEmail']")
    public WebElement contactEmailBox;

    @FindBy(xpath = "//input[@id='Notes']")
    public WebElement notesTextBox;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButton;

    @FindBy(xpath ="//input[@id='Approved']")
    public WebElement approvedCheckBox;

    @FindBy(xpath = "//input[@id='IsPaid']")
    public WebElement iPaidCheckBox;

    @FindBy(xpath = "//div[text()='RoomReservation was inserted successfully']")
    public WebElement basariliRezervasyonYapildiYazisi;

    @FindBy(xpath = "//label[text()='Select User']")
    public WebElement selectUserErrorYazisi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveOkButonu;







}
