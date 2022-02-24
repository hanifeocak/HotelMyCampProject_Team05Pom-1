package tests.us_010;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_010;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {

    HMCPages hmcPages;
    US_010 us010;


    @Test
    public void rezervasyonBilgileriGuncellemeTesti(){
        extentTest=extentReports.createTest("Rezervasyon bilgileri guncelleme testi",
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
        extentTest.info("Kullanici giris yapildi");

        //4- Reservations sayfasina gider
        us010.reservationsButtonElement.click();
        extentTest.info("Reservations sayfasina gider");

        //5- End Date degistirir
        us010.RezEndDateElement.sendKeys("28.02.2022", Keys.ENTER);
        extentTest.pass("Gunceleme islemi yapilabilir");

    }
}
