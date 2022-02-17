package tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Us_009_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {
    //1- Yönetici https://www.hotelmycamp.com/ URL ile anasayfaya gelir
    //2-Yönetici login butonunu tıklar
    //3-Yönetici username'ini yazar
    //4-Yönetici password'unu yazar
    //5-login butonuna basar
    //6. LISTOFUSER sayfası görüntülenir


    @Test
    public void  test(){
        Us_009_Pages us_009_pages= new Us_009_Pages();

        extentTest=extentReports.createTest("TC_01","otel odasina giris");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        us_009_pages.firstLogInElement.click();
       us_009_pages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        us_009_pages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        us_009_pages.secondLogInElement.click();
        Assert.assertTrue(us_009_pages.listOfUsersElement.isDisplayed());
    }




    }
