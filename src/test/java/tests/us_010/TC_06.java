package tests.us_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_010;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_06 extends TestBaseRapor {

    HMCPages hmcPages;
    US_010 us010;


    @Test
    public void yanlisEmailIleKayıtYapilamazTesti(){
        extentTest=extentReports.createTest("Yanlis email ile rezervasyon gerceklestirilemez testi",
                "Daha once yaptıgı rezervasyon bilgilerini guncelleyebilmeli");
        hmcPages=new HMCPages();
        us010 = new US_010();

        //1- Kullanıcı URL gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

        //2- Log in butonuna basar
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tiklar");

        //3- Kullanıcı olarak giris yapar
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("US010_username"));
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("US010_password"));
        hmcPages.secondLogInElement.click();
        extentTest.info("Kullanıcı girisi yapar");

        //4- Rooms sayfasına gider
        us010.roomsButton.click();
        extentTest.info("Rooms sayfasına gider");

        //5-  Advanced Search kısmındaki bilgileri doldurur ve search yapar
        Actions actions = new Actions(Driver.getDriver());
        us010.checkInDateButton.clear();
        us010.checkInDateButton.sendKeys(ConfigReader.getProperty("US010_CheckInDate"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us010.checkOutDateButton.clear();
        us010.checkOutDateButton.sendKeys(ConfigReader.getProperty("US010_CheckOutDate"));

        Select option1 = new Select(us010.selectRooms);
        option1.selectByVisibleText(ConfigReader.getProperty("US010_RoomType"));

        Select option2 = new Select(us010.selectAdult);
        option2.selectByVisibleText(ConfigReader.getProperty("US010_Adult"));

        Select option3 = new Select(us010.selectChildren);
        option3.selectByVisibleText(ConfigReader.getProperty("US010_Children"));

        us010.locationBox.sendKeys(ConfigReader.getProperty("US010_Location"));

        us010.searchButton.click();
        extentTest.info("Advanced Search kismindaki bilgiler girildi");

        //6- Ilk secenegi secer
        us010.ilkAramaSonucuElement.click();
        extentTest.info("Ilk secenek tıklandı");

        //7- Istenen bilgileri doldurur,sadece email ----@xxxxx.xxx seklinde girer
        us010.checkInDateButton.clear();
        us010.checkInDateButton.sendKeys(ConfigReader.getProperty("US010_CheckInDate"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us010.checkOutDateButton.clear();
        us010.checkOutDateButton.sendKeys(ConfigReader.getProperty("US010_CheckOutDate"));
        option2.selectByVisibleText(ConfigReader.getProperty("US010_Adult"));
        option3.selectByVisibleText(ConfigReader.getProperty("US010_Children"));
        us010.rezervasyonEmailButtonElement.clear();
        us010.rezervasyonEmailButtonElement.sendKeys(ConfigReader.getProperty("US010_wrongEmail"));
        us010.nameOfCreditCardElement.sendKeys(ConfigReader.getProperty("US010_NOfCCart"));
        us010.creditCardNumberElement.sendKeys(ConfigReader.getProperty("US010_CCNu"));

        Select options4 = new Select(us010.selectcreditCardExpritionYear);
        options4.selectByVisibleText(ConfigReader.getProperty("US010_CCExpirationYear"));

        Select options5 = new Select(us010.selectcreditCardExpritionMonth);
        options5.selectByVisibleText(ConfigReader.getProperty("US010_CCExpirationMonth"));

        us010.cVVElement.sendKeys(ConfigReader.getProperty("US010_CVV"));

        us010.messageElement.sendKeys(ConfigReader.getProperty("US010_Message"));
        extentTest.info("Hatalı email girisi yapildi");

        //8- "Book This Room" butnonuna tiklar
        us010.bookThisRoomElement.click();
        extentTest.info("Book This Room butonuna tiklar");

        //9- Rezervasyonun yapilamadigini gorur
        ReusableMethods.waitFor(3);
        Assert.assertFalse(us010.successfullyTextElement.isDisplayed());
        extentTest.pass("Rezervasyon yapilamadigini gorur");
    }
}
