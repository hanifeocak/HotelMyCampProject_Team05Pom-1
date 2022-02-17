package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_006 {


    public US_006(){ PageFactory.initElements(Driver.getDriver(),this);  }

    @FindBy(xpath = "//select[@title='Select Group'][1]")
    public WebElement idGroupbaslikelementi ;
    @FindBy(xpath = "//select[@title='Select Hotel']")
    public WebElement idHotelBaslikElementi;
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addhotelroomlink;
    @FindBy(xpath = "//div[@class='portlet-title']")
    public  WebElement createhotelroomelementi;
    @FindBy(xpath = "//div[@class='margin-bottom-5']")
    public WebElement listOfHotelsSearchButton;
    @FindBy(xpath = "//select[@id='IDHotel']")
    public WebElement idhotelbox;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement idCodebox;
    @FindBy(xpath ="//input[@id='Name']")
    public WebElement nameboxElementi;

    @FindBy(xpath = "//input[@title='Location']")
    public WebElement locationElementi;
    @FindBy(xpath = "//div[*='Description']")
    public WebElement descriptionElementi;
    @FindBy(xpath = "//input[@id='Price']")
    public WebElement priceboxElementi;
    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement roomtypeboxElementi;
    @FindBy(xpath = "//input[@id='MaxAdultCount']")
    public WebElement maxadultcountboxElementi;

    @FindBy(xpath = "//input[@id='MaxChildCount']")
    public WebElement maxchildrencountboxElementi;

    @FindBy(xpath = "//input[@id='IsAvailable']")
    public WebElement isavailableboxElementi;
    @FindBy(xpath = "//tbody//tr//td[2]")
    public WebElement searchcodebox;
    // 2.satiri yazdir  //tbody//tr[2]
    // 7.satiri yazdir //tbody//tr[7]

    @FindBy(xpath = "//tbody//tr//td[3]")
    public WebElement searchnamebox;


}
