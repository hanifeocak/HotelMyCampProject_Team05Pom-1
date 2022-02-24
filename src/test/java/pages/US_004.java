package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
public class US_004 {
    public US_004(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@*='fa fa-plus']")
    public WebElement addHotelButton;
    @FindBy(xpath = "(//input[@*='form-control input-lg required'])[2]")
    public WebElement createHotelNameBox;
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement AddHotelButton;
    @FindBy(xpath = "//input[@id='Address']")
    public WebElement createHotelAddressBox;
    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement createHotelPhoneBox;
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement createHotelEmailBox;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement logOutButton;
    public void createHotelDropdownButton() {
        WebElement dropDownElement = Driver.getDriver().findElement(By.xpath("//select[@*='form-control input-lg required']"));
        Select select = new Select(dropDownElement);
        select.selectByIndex(1);
    }
    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement createHotelSaveBox;
    @FindBy(xpath = "(//div[@class='modal-body'])[2]")
    public WebElement createHotelWasInsertedSuccessfullyText;
    @FindBy(xpath = "//button[@data-bb-handler='ok']")
    public WebElement createHotelWasInsertedSuccessfullyOkButton;
    @FindBy(xpath = "(//input[@*='form-control form-filter input-sm'])[2]")
    public WebElement listOfHotelsCodeButton;
    @FindBy(xpath = "//button[@*='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement listOfHotelsSearchButton;
    @FindBy(xpath = "(//tr[@role='row'])[3]")
    public WebElement listOfHotelUniqueSearch;
    public void setLogOutButton(){
        Actions actions=new Actions(Driver.getDriver());
        WebElement manager=Driver.getDriver().findElement(By.xpath("//span[@class='username username-hide-on-mobile']"));
        actions.moveToElement(manager).perform();
        WebElement logOutButton=Driver.getDriver().findElement(By.xpath("//a[normalize-space()='Log out']"));
        logOutButton.click();
    }
}
