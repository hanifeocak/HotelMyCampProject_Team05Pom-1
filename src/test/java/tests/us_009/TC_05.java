package tests.us_009;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.Us_009_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {
    //1- Yönetici https://www.hotelmycamp.com/ URL ile anasayfaya gelir
    //2-Yönetici login butonunu tıklar
    //3-Yönetici username'ini yazar
    //4-Yönetici password'unu yazar
    //5-login butonuna basar
    //6. LİSTOFUSER sayfasindaki Hotel Management menusune tıklar
    //7. Hotel Management menusunden Room reservation'u secer
    //8.Yönetici Edit Hotelroomreservatıon sayfasina gelir
    //9. Yönetici Edit Hotelroomreservatıon sayfasindaki "delete" butonunu tıklar
    //10.Yönetici "Would you like to continue" alert yazisini görür
    //11.Yönetici "Ok" butonuna basar
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
        us_009_pages.detailsButonu.click();
        us_009_pages.propertiesButonu.click();
        us_009_pages.deleteButonu.click();
        us_009_pages.bekle(3);
        us_009_pages.deleteOkButonu.click();

    }

}
