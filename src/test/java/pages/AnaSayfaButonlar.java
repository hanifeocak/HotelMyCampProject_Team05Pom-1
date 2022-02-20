package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AnaSayfaButonlar {

    public AnaSayfaButonlar(){ PageFactory.initElements(Driver.getDriver(),this);  }

    @FindBy(id = "navHome")
    public WebElement Home ;


    @FindBy(id = "navRooms")
    public WebElement Rooms ;

    @FindBy(id = "navRestaurant")
    public WebElement Restaurant ;

    @FindBy(id = "navAbout")
    public WebElement About ;

    @FindBy(id = "navBlog")
    public WebElement Blog ;

    @FindBy(id = "navContact")
    public WebElement Contact ;

    @FindBy(id = "navLogon")
    public WebElement Login ;

    @FindBy(xpath = "(//h1[@class='mb-3'])[1]")
    public WebElement welcomeToHotelmyCamp ;
    //

    @FindBy(xpath = "//input[@class='form-control checkin_date']")
    public WebElement checkinDate ;

    @FindBy(xpath = "//input[@class='form-control checkout_date']")
    public WebElement checkOutDate ;

    @FindBy(xpath = "(//select[@class='form-control required'])[2]")
    public WebElement customer ;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement checkAvailability ;

    @FindBy(xpath = "(//select[@class='form-control required'])[1]")
    public WebElement roomType ;


    @FindBy(xpath = "/html/body/section[5]/div/div[2]/div[1]/div/div/p[2]/a")
    public WebElement room1 ;

    @FindBy(xpath = "/html/body/section[5]/div/div[2]/div[2]/div/div/p[2]/a")
    public WebElement room2 ;

    @FindBy(xpath = "/html/body/section[5]/div/div[2]/div[3]/div/div/p[2]/a")
    public WebElement room3 ;

    @FindBy(xpath = "/html/body/section[5]/div/div[2]/div[4]/div/div/p[2]/a")
    public WebElement room4 ;

    @FindBy(xpath = "/html/body/section[5]/div/div[2]/div[5]/div/div/p[2]/a")
    public WebElement room5 ;

    @FindBy(xpath = "/html/body/section[5]/div/div[2]/div[6]/div/div/p[2]/a")
    public WebElement room6 ;

    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[1]")
    public WebElement instagramFoto1 ;


    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[2]")
    public WebElement instagramFoto2 ;


    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[3]")
    public WebElement instagramFoto3 ;


    @FindBy(xpath = "(//div[@class='icon d-flex justify-content-center'])[4]")
    public WebElement instagramFoto4 ;

    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement instagramFotoClose ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[1]")
    public WebElement footerBlog ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[2]")
    public WebElement footerRooms ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[3]")
    public WebElement footerAmenitiesTest ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[4]")
    public WebElement footerGiftCard ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[5]")
    public WebElement footerCareer ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[6]")
    public WebElement footerAboutUs ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[7]")
    public WebElement footerContactUs ;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[8]")
    public WebElement footerServices ;

    @FindBy(xpath = "(//span[@class='text'])[2]")
    public WebElement footerTelefonNo ;

    @FindBy(xpath = "(//span[@class='text'])[3]")
    public WebElement footerInfo ;





    //



}
