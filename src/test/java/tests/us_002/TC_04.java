package tests.us_002;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_04 extends TestBaseRapor {
    @Test
    public void logInButonuGorunurErisebilir(){

        HMCPages hmcPages= new HMCPages();

        extentTest=extentReports.createTest("TC_04",
                "Log in butonu gorunur ve erisilebilir oldugu testi");

        //1- Yönetici olarak URL'ye gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");

        //2- Log in butonuna basar
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tikladi");

        //3- Log in butonunu gorulur
        Assert.assertTrue(hmcPages.secondLogInElement.isDisplayed());
        extentTest.info("Log in butonu gorunur");

        //4- Log in butonuna erisebilmeilidir
        Assert.assertTrue(hmcPages.secondLogInElement.isEnabled());
        extentTest.pass("Log in butonu erisilebilir");
    }
}
