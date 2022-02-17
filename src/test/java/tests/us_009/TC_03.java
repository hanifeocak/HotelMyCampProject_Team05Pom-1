package tests.us_009;

import org.testng.annotations.Test;
import pages.HMCPages;
import pages.Us_009_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {
    //1- Yönetici https://www.hotelmycamp.com/ URL ile anasayfaya gelir
    //2-Yönetici login butonunu tıklar
    //3-Yönetici username'ini yazar
    //4-Yönetici password'unu yazar
    //5-login butonuna basar
    //6. LİSTOFUSER sayfasindaki Hotel Management menusune tıklar
    //7. Hotel Management menusunden Room reservation'u secer
    //8.LİST OF RESERVATİONS sayfasindaki search butonuyla arama yapar
    //9.LİST OF RESERVATİONS sayfasindaki clear butonu ile aramayı siler
    @Test
    public void  test(){
        Us_009_Pages us_009_pages= new Us_009_Pages();

        extentTest=extentReports.createTest("TC_01","otel odasina giris");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        us_009_pages.firstLogInElement.click();
        us_009_pages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        us_009_pages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        us_009_pages.secondLogInElement.click();

        us_009_pages.hotelManagementLink.click();
        us_009_pages.hotelRoomReservationsLink.click();
        us_009_pages.contactNameSurnamebox.sendKeys("asd");
        us_009_pages.bekle(3);
        us_009_pages.searchButonu.click();
        us_009_pages.clearButonu.click();
    }

}
