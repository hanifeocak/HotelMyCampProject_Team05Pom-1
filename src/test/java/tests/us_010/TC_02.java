package tests.us_010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_010;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {

    @Test
    public void reservasyonBilgiTabloTesti(){

        extentTest=extentReports.createTest("reservasyonBilgiTabloTesti",
                "kullanıcı rezervasyon bilgi tablosunu gormesi gerekir");
        HMCPages hmcPages=new HMCPages();
        US_010 us010 = new US_010();

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
        extentTest.info("kullanıcı girisi yapildi");
        //4- Rooms sayfasına gider
        us010.roomsButton.click();
        extentTest.info("Room sayfasını gidildi");
        //5- Advanced Service yazisini gorur
        Assert.assertTrue(us010.advancedReservationYazisi.isDisplayed());
        extentTest.pass("Advanced Service yazisi goruldu");

    }

}
