package tests.us_006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    @Test
    public void test02(){
        extentTest=extentReports.createTest("yonetici login testi",
                "yonetici oda olusturma islemlerini yapmasi gerekir");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
extentTest.info("Url'e gidildi");

        HMCPages hmcPages=new HMCPages();

        WebElement firstLogInElement = hmcPages.firstLogInElement;

        hmcPages.firstLogInElement.click();
        //	test data username: manager1 ,
        hmcPages.userNameBoxElement.sendKeys("manager1");
        //	test data password : Manager1
        hmcPages.passwordBoxElement.sendKeys("manager1"+ Keys.ENTER);
        // hmcPages.passwordBoxElement.click();

        //	Degerleri girildiginde sayfaya basarili sekilde girilemedigini test edin
        // FALSE //

        Assert.assertFalse(hmcPages.girisYapilamadiYaziTesti.isDisplayed());

    }

}
