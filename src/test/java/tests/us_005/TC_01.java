package tests.us_005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {



    @Test
    public  void test01() {

        extentTest=extentReports.createTest("kullanıcı hesabı olusturma islemi testi",
                "kullanıcı hesap olusturma islemlerini yapmasi gerekir");

        //https://hotelmycamp.com/
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //Sağ üstteki "Login"butonuna tıklayın
        HMCPages hmcPages=new HMCPages();
        hmcPages.firstLogInElement.click();

        //"Username" butonuna geçerli bir username girin
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

       //"Password" butonuna geçerli bir password girin
       hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
       hmcPages.bekle(3);


      //"Login" Butonuna tıklayın
        hmcPages .secondLogInElement.click();

        //"Hotel Management" menüsüne tıklayın
        hmcPages.hotelManagementLink.click();
        //"Hotel List" menüsüne tıklayın
        hmcPages.hotelListLinki.click();
        //"List Of Hotels" başlığının görünürlüğünü kontrol edin
        Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());

     Driver.getDriver().close();


    }
}
