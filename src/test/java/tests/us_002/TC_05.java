package tests.us_002;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_05 extends TestBaseRapor {
    HMCPages hmcPages;
    @Test
    public void basariliGirisYapildiTesti(){
        hmcPages= new HMCPages();

        extentTest=extentReports.createTest("TC_04",
                "Log in butonu gorunur ve erisilebilir oldugu testi");

        //1- Yönetici olarak URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");

        //2- Log in butonuna basar
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tikladi");

        //3- username ve password girer
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPages.secondLogInElement.click();
        extentTest.info("Username, Password girisi yapildi ve Log in butonuna basildi");

        //4- Yonetici hesabinin acildigini gorur
        Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());
        extentTest.pass("Giris yapildi");
    }
}