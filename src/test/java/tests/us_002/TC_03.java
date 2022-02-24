package tests.us_002;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_03 extends TestBaseRapor {
    HMCPages hmcPages;
    @Test
    public void passwordKutusuGorunurVeriGirisiTesi(){
        hmcPages= new HMCPages();

        extentTest=extentReports.createTest("TC_03",
                "Password kutusu gorunu ve veri girisi yapilma testi");

        //1- Yönetici olarak URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");

        //2- Log in butonuna basar
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tikladi");

        //3- Log in butonunu gorulur
        Assert.assertTrue(hmcPages.secondLogInElement.isDisplayed());
        extentTest.info("Password kutusu gorunur");

        //4- Log in butonuna erisebilmeilidir
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.info("Password kutusuna veri girisi yapildi");

    }
}
