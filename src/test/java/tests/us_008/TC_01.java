package tests.us_008;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_008Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {
    // Yönetici olarak gecerli username, gecerli password ile
    // 'Log in' islemi gerceklestirilmelidir.

    HMCPages hmcPages=new HMCPages();
    US_008Page us_008Page=new US_008Page();

    @Test
    public void testCase01(){
        extentTest=extentReports.createTest("yönetici olarak basarili giris testi","yonetici olarak giris yapar");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("Url'e gidildi");
        // Log in butonuna basilir
       us_008Page.firstLogInElement.click();
        extentTest.info("Log in butonuna basildi");

        // gecerli username girilir
        us_008Page.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.info("Username girildi");

        // gecerli password girilir
        us_008Page.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        extentTest.info("Password girildi");

        //Log in butonuna tiklanir
        us_008Page.secondLogInElement.click();
        extentTest.info("Giris icin Log in butonuna basildi");

        //Degerler girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(us_008Page.basariliGirisYaziElementi.isDisplayed());
        extentTest.pass("Giris yapildi");
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(hmcPages.kullaniciAdiElement).perform();
        hmcPages.logOut.click();
        extentTest.info("Cikis yapildi");




    }
}
