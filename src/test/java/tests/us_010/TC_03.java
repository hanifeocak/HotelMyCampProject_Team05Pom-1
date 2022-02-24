package tests.us_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_010;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {

    HMCPages hmcPages;
    US_010 us010;

    @Test
    public void kullanıcıGirisYpmdnRezYapamazTesti(){
        extentTest=extentReports.createTest("kullanıcı giris yapmadan giris yapamaz testi",
                "kullanıcı giris yapmadan rezervasyon islemlerini gerceklestiremez");
        hmcPages=new HMCPages();
        us010 = new US_010();

        //1- Kullanıcı URL gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

        //2- Rooms sayfasına gider
        us010.roomsButton.click();
        extentTest.info("Rooms sayfasına gidildi");

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


        //4- Ilk secenegi secer
        us010.ilkAramaSonucuElement.click();
        extentTest.info("Ilk secenek tıklandı");

        //5- Giris yapmadan rezervasyon yapamayacagi yazisi gorulmelidir
        String actualText=us010.rezervasyonYapilmazYazisiElement.getText();
        String expectedText="You have to login to be able to book this room";
        Assert.assertTrue(actualText.contains(expectedText));
        extentTest.pass("Giris yapmadan rezervasyon yapamayacagi yazisi goruldu");

    }

}
