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

public class TC_04 extends TestBaseRapor {

    @Test
    public void misafirOlarakYaptigiIslemiSayfasınaEklenmesiTesti(){
        extentTest=extentReports.createTest("Misafir olarak yaptıgı islemlerin sayfasına eklenmesi",
                "Misafir olarak yaptıgı islemleri kullanıcı sayfasında gorur");
        HMCPages hmcPages=new HMCPages();
        US_010 us010 = new US_010();

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
        String secilenUrunText=us010.ilkAramaSonucuElement.getText();
        us010.ilkAramaSonucuElement.click();
        extentTest.info("Ilk secenek tıklandı");

        //5- Giris yapmadan reservation yapamayacagi uyarisini alir
        //6- Log in sayfasına gider ve Kullanıcı girisi yapar
        us010.rezervasyonYapilmazSayfasıLogInButtonElement.click();
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("US010_username"));
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("US010_password"));
        hmcPages.secondLogInElement.click();
        extentTest.info("Kullanıcı girisi yapildi");

        //7- Secmis oldugu room kullanıcının sayfasında gorulmelidir
        String klncSyfSecilenRoom=us010.kullanıcGirisIleKontrolElement.getText();
        System.out.println("secilenUrunText = " + secilenUrunText);
        System.out.println("klncSyfSecilenRoom = " + klncSyfSecilenRoom);
        Assert.assertEquals(klncSyfSecilenRoom,secilenUrunText);
        extentTest.pass("Misafir olarak yaptıgı islemleri sayfasında gorundu");


    }

}
