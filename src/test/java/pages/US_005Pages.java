package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import utilities.Driver;

public class US_005Pages {
    //*******************US005page**************************************
    public void USPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//span[.='Hotel Management']" )
    public WebElement hotelManagementYaziElementi;

    @FindBy(xpath = "//span[text()='List Of Hotels']")
    public WebElement listOfHotelYaziElementi;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListIkonElementi;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement detailsButonElementi;

    @FindBy(xpath = "(//div[@class='portlet-title'])[1]")
    public WebElement editHotelYaziElementi;

    @FindBy(xpath = "//div[@class='portlet-title'][2]")
    public WebElement hotelDataYaziElementi;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeKutusuElementi;

    @FindBy(id = "Name")
    public WebElement nameKutusuElementi;

    @FindBy(id = "Address")
    public WebElement addressKutusuElementi;

    @FindBy(id = "Phone")
    public WebElement phoneKutusuElementi;

    @FindBy(id = "Email")
    public WebElement emailKutusuElementi;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement dropdownElementi;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButonElementi;

    @FindBy(xpath = "//div[.='Hotel was updated successfully']")
    public  WebElement successfullyYaziElementi;

    @FindBy(xpath = "//div[.='Would you like to continue?']")
    public WebElement contiuneYaziElementi;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButonElementi;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteButonElementi;

}
