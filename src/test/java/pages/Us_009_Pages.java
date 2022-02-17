package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Us_009_Pages {
    public Us_009_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public  WebElement firstLogInElement ;

    @FindBy (xpath = "//input[@id='UserName']")
    public  WebElement userNameBoxElement;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement passwordBoxElement;

    @FindBy(xpath = "(//input[@id='btnSubmit'])[1]")
    public  WebElement secondLogInElement;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement listOfUsersElement;

    @FindBy (xpath = "//span[.='Hotel Management']")
    public WebElement hotelManagementLink;

    @FindBy (xpath = "(//i[@class='icon-calendar'])[4]")
    public WebElement hotelRoomReservationsLink;

    @FindBy(xpath = "//span[.='List Of Reservations']")
    public WebElement listOfReservationsElement;

    @FindBy(xpath = "//input[@name='ContactNameSurname']")
    public WebElement contactNameSurnamebox;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchButonu;

    @FindBy(xpath = "//button[@class='btn btn-sm red filter-cancel']")
    public WebElement clearButonu;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement detailsButonu;

    @FindBy(xpath = "//a[.='Properties']")
    public WebElement propertiesButonu;

    @FindBy(xpath = "(//button[@class='btn green'])[2]")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[text()=\"Value couldn't be added, provide a value please\"]")
    public WebElement saveAlertYazisi;

    @FindBy(xpath = "(//div[@class='modal-footer'])[2]")
    public WebElement saveAlertYazisiOkButonu;

    @FindBy(xpath = "//*[@id=\"btnDelete\"]")
    public WebElement deleteButonu;

    @FindBy(xpath = "//div[@class='modal-footer']")
    public WebElement deleteOkButonu;





    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
