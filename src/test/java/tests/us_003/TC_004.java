package tests.us_003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US003Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_004 extends TestBaseRapor {
    WebDriver driver;

    @Test
    public void test04() throws InterruptedException {
        // 4- Kullanici olusturdugu hesapla profiline erisebilmelidir.

        // 1-Kullanici Anasayfaya gider
        // 2-login sayfasina erisir.
        // 3-kullanici bilgilerini doldurur
        // 4-login yapar
        // 5-Profil sayfasında oldugunu test eder


        extentTest=extentReports.createTest("TC_004","4.Profile Pozitif Giris Testi");
        HMCPages hmcPages=new HMCPages();
        US003Pages us003Pages=new US003Pages();

        // 1-Kullanici Anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

        // 2-login sayfasina erisir.
        hmcPages.firstLogInElement.click();
        extentTest.info("Login sayfasina erisildi");

        // 3-kullanici bilgilerini doldurur
        hmcPages.userNameBoxElement.sendKeys("emre999");
        hmcPages.passwordBoxElement.sendKeys("Istanbul34*");

        // 4-login yapar
        hmcPages.secondLogInElement.click();
        extentTest.info("kullanici bilgileri dolduruldu");

        // 5-Profil sayfasında oldugunu test eder
        String expectedProfilText=us003Pages.profilePageText.getText();
        String actualProfilText="Profile Page";

        Assert.assertEquals(expectedProfilText, actualProfilText);
        extentTest.pass("doğrulandi");
    }

}
