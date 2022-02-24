package tests.us_009;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Us_009_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor {
    //1- Yönetici https://www.hotelmycamp.com/ URL ile anasayfaya gelir
    //2-Yönetici login butonunu tıklar
    //3-Yönetici username'ini yazar
    //4-Yönetici password'unu yazar
    //5-login butonuna basar
    //6. LİSTOFUSER sayfasindaki Hotel Management menusune tıklar
    //7. Hotel Management menusunden Room reservation'u secer
    //8. LİST OF RESERVATİONS sayfasindaki details butonu ile  Edit Hotelroomreservatıon sayfasına gelir
    //9.Yönetici save butonuna basar
    //10.Yönetici "User was uptadet successfully" alert yazisini görür
    //11. Yönteci "Ok" butonuna basar
    Us_009_Pages us_009_pages;

    @Test
    public void  test(){
        us_009_pages= new Us_009_Pages();

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
        us_009_pages.bekle(3);
        us_009_pages.saveButonu.click();
        us_009_pages.bekle(3);

       /* // Switching to Alert

        Alert alert = Driver.getDriver().switchTo().alert();

        // Capturing alert message.    
        String alertMessage= alert.getText();

        // Displaying alert message		
        System.out.println(alertMessage);*/


        boolean actualAlertYazisi=us_009_pages.saveAlertYazisi.isDisplayed();
        Assert.assertTrue(actualAlertYazisi);


        us_009_pages.saveAlertYazisiOkButonu.click();
    }

}
