package tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {
    // Yönetici olarak gecerli username, gecerli password ile
    // 'Log in' islemi gerceklestirilmelidir.

    US_008Page us_008Page=new US_008Page();

    @Test
    public void testCase01(){
        extentTest=extentReports.createTest("yönetici olarak basarili giris testi","yonetici olarak giris yapar");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("Url'e gidildi");
        // Log in butonuna basilir
       us_008Page.firstLogInElement.click();

        // gecerli username girilir
        us_008Page.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        // gecerli password girilir
        us_008Page.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

        //Log in butonuna tiklanir
        us_008Page.secondLogInElement.click();

        //Degerler girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(us_008Page.basariliGirisYaziElementi.isDisplayed());




    }
}
