package tests.us_003;

import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {

    @Test
    public void test01(){
        //1.Kullanici websitesine erisim saglamali ve Login butonunu gormelidir.

        //1-Kullanici url'e gider.
        //2-Kullanici Login butonunu gorur ve basar

        extentTest=extentReports.createTest("TC_001","1.Url erisim Testi");

        HMCPages hmcPages=new HMCPages();

        //1-Kullanici url'e gider.
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("Url'e gidildi");

        //2-Kullanici Login butonunu gorur ve basar
        hmcPages.firstLogInElement.click();

        extentTest.info("Login Butonuna erisildi.");
        extentTest.pass("doğrulandi");

    }


}
