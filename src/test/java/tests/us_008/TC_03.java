package tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {

    //Yönetici olarak gecerli username,GECERSIZ password ile
    //'Log in' islemi gerceklestirilememelidir.

    US_008Page us_008Page=new US_008Page();

    @Test
    public void testCase03(){
        extentTest=extentReports.createTest("basarili giris yapilamama testi","yonetici olarak giris yapamaz");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("Url'e gidildi,giris yapilamadi");
        // Log in butonuna basilir
        us_008Page.firstLogInElement.click();

        //gecerli username girilir
        us_008Page.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        //gecersiz password girilir
        us_008Page.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));

        //Log in butonuna tiklanir
        us_008Page.secondLogInElement.click();

        //Degerler girildiginde sayfaya basarili sekilde giris yapilamadigini test et

        Assert.assertTrue(us_008Page.girisYapilamadiYaziTesti.isDisplayed());
    }
}
