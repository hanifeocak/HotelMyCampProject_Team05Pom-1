package tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_008Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor {
    // Yönetici olarak Hotel Management bölümünün altindaki
    // "Room Reservations" kismi tiklanabilir olmalidir.

    HMCPages hmcPages;
    US_008Page us_008Page;

    @Test
    public void testCase04(){
        hmcPages=new HMCPages();
        us_008Page=new US_008Page();
        extentTest=extentReports.createTest("Room Reservations a tiklama testi","Room Reservations kismi tiklandi");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("Room Reservations kismi tiklandi");
        // Log in butonuna basilir
        us_008Page.firstLogInElement.click();

        // gecerli username girilir
        us_008Page.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        // gecerli password girilir
        us_008Page.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

        //Log in butonuna tiklanir
        us_008Page.secondLogInElement.click();

        //1-Hotel Management bölümüne tiklanir.
        us_008Page.hotelManagementButton.click();

        // 2-Hotel Management bölümünün altindaki "Room reservations"a tiklanir.
        us_008Page.roomReservationsButton.click();

        //"LIST OF RESERVATIONS" yazisi görünür olmalidir.
        Assert.assertTrue(us_008Page.listOfReservationsYazisi.isDisplayed());
    }
}
