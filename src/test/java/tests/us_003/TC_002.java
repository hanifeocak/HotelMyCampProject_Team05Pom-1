package tests.us_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US003Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_002 extends TestBaseRapor {
    HMCPages hmcPages;
    US003Pages us003Pages;

    @Test
    public void test02(){
        // 2.Kullanici Login sayfasinda yeni hesap olustur butonuna erismeli ve basvuru formuna erismelidir.

        //1-Kullanici Login sayfasina erisim saglar
        //2-Kullanici yeni hesap olustur butonuna tıklar.
        //3-Basvuru formu sayfasına erisim saglar.


        extentTest=extentReports.createTest("TC_002","2.Yeni Hesap Olusturma Butonu Testi.");

        hmcPages=new HMCPages();
        us003Pages=new US003Pages();

        //1-Kullanici Login sayfasina erisim saglar
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hmcPages.firstLogInElement.click();

        extentTest.info("Login Sayfasin'a gidildi");

        //2-Kullanici yeni hesap olustur butonuna tıklar.
        us003Pages.createNewAccountButton.click();
        extentTest.info("Yeni Hesap Olustur Butonuna erisildi.");

        //3-Basvuru formu sayfasına erisim saglar.
        String expectedText=us003Pages.registrationFromTextPage.getText();
        String actualText="Registration Form";

        Assert.assertEquals(expectedText,actualText,"Registration Sayfasina Ulasilamadi");

        extentTest.info("Basvuru formu sayfasına gidildi");
        extentTest.pass("doğrulandi");
    }

}