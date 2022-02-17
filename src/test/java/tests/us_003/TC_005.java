package tests.us_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US003Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_005 extends TestBaseRapor {
    //  5-Kullanici Negatif giris testi

    //   1-Kullanici url'e gider
    //   2-Kullanici login butonunu gorur ve basar
    //   3-Kullanici test datasi olarak username: emre999 girer
    //   4-Kullanici test datasi olarak password : Istanbul*34 girer
    //   5-Kullanici mevcut test datalari ile sayfaya girilemedigini test eder

    @Test
    public void test05() {
        extentTest=extentReports.
                createTest("TC_005","5.Kullanici Negatif Giris Testi");
        HMCPages hmcPages=new HMCPages();
        US003Pages us003Pages=new US003Pages();

        //   1-Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");

        //   2-Kullanici login butonunu gorur ve basar
        hmcPages.firstLogInElement.click();
        extentTest.info("Login yapildi");

        //   3-Kullanici test datasi olarak username: emre999 girer
        hmcPages.userNameBoxElement.sendKeys("emre999");
        extentTest.info("username girildi");

        //   4-Kullanici test datasi olarak password : Istanbul*34 girer
        hmcPages.passwordBoxElement.sendKeys("Istanbul*34");
        extentTest.info("password girildi");

        //   5-Kullanici test datalarini kullanarak login yapar
        hmcPages.secondLogInElement.click();
        extentTest.info("mevcut datalarla login yapildi");

        //   6-Kullanici mevcut test datalari ile sayfaya girilemedigini test eder
        ReusableMethods.waitFor(3);
        String expectedNegativeLoginText=us003Pages.negativeLoginText.getText();
        String actualNegativeLoginText="Try again please";
        extentTest.info("Login yapilamadi");

        ReusableMethods.waitFor(3);
        Assert.assertEquals(expectedNegativeLoginText,actualNegativeLoginText);
        extentTest.pass("doğrulandi");


    }
}
