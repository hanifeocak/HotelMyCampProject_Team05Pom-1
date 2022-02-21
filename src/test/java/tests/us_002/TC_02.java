package tests.us_002;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_02 extends TestBaseRapor {
    @Test
    public void userNameKutusuGorunurVeriGirisiTesi(){

        HMCPages hmcPages= new HMCPages();
        extentTest=extentReports.createTest("TC_02",
                "Username kutusu gorunur ve veri girisi yapilma testi");

        //1- Yönetici olarak URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");

        //2- Log in butonuna basar
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tikladi");

        //3- Username kutusu erisebilir
        Assert.assertTrue(hmcPages.userNameBoxElement.isDisplayed());
        extentTest.info("Username kutusu gorunur");

        //4- Username kutusuna veri girer
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.info("Username kutusuna veri girisi yapildi");

    }
}