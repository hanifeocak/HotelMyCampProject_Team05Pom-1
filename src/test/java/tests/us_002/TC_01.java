package tests.us_002;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_01 extends TestBaseRapor {
    HMCPages hmcPages;
    @Test
    public void girisSayfasiTesti(){
        hmcPages= new HMCPages();

        extentTest=extentReports.createTest("TC_01",
                "Giris sayfasının gorulebilir olmasi Testi");

        //1- Yönetici olarak URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");

        //2- Log in butonuna gorur
        Assert.assertTrue(hmcPages.firstLogInElement.isDisplayed());
        extentTest.info("Log in butonu goruldu");

        //3- Log in butonuna tiklar
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tikladi");

        //4- Giris sayfası acilir
        Assert.assertTrue(hmcPages.secondLogInElement.isDisplayed());
        extentTest.info("Giris sayfasi goruldu");

    }
}
