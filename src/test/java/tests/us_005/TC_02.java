package tests.us_005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_005Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_02  {


    @Test
    public  void test01() {
        //https://hotelmycamp.com/
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //Sağ üstteki "Login"butonuna tıklayın
        US_005Pages us005Pages=new US_005Pages();
        HMCPages hmcPages = new HMCPages();
        hmcPages.firstLogInElement.click();

        //"Username" butonuna geçerli bir username girin
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        //"Password" butonuna geçerli bir password girin
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPages.bekle(3);

        //"Login" Butonuna tıklayın
        hmcPages.secondLogInElement.click();

        //"Hotel Management" menüsüne tıklayın
        hmcPages.hotelManagementLink.click();
        //"Hotel List" menüsüne tıklayın
        hmcPages.hotelListLinki.click();
        //"List Of Hotels" başlığının görünürlüğünü kontrol edin
        Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());

      //"Details" butonuna tıklayın
        hmcPages.bekle(3);
       us005Pages.detailsButonElementi.click();

     //"Edit Hotel" başlığının görünürlüğünü kontrol edin
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
       Assert.assertTrue(us005Pages.editHotelYaziElementi.isDisplayed());
        }
    }
