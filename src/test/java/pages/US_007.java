package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class US_007 {
    public US_007(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomsLink;

    @FindBy(xpath = " //a[@class='btn btn-xs default']")
    public WebElement listOfHotelRoomsDetailsButton;

    @FindBy(xpath = " //a[text()='Edit Hotelroom']")
    public WebElement detailsGirisKontrol;

    @FindBy(xpath = "(//select[@class='form-control input-lg required'][1])")
    public WebElement selectHotelDropdown;

    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement editTestArea;

    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement selectRoomType;

    @FindBy(id = "IsAvailable")
    public WebElement isAvailebleCheckBox;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement editPageSaveButton;

    @FindBy(xpath = "//div[text()='HotelRoom was updated successfully']")
    public WebElement saveSuccessful;

    @FindBy(xpath = "//a[text()='Properties']")
    public WebElement propertiesSekmesi;

    @FindBy(xpath = "//select[@id='lkpBarcodeTypes']")
    public WebElement propertiesTipDropdown;

    @FindBy(xpath = "//*[@id=\"tab_properties\"]/div/div[2]/div[2]/div[4]/div[2]/button")
    public WebElement propertiesSaveButton;

    @FindBy(xpath = "//div[text()='Value added']")
    public WebElement propertiesSaveControl;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement deleteOkButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement deleteSuccessfulAlert;



    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();
    }

}
