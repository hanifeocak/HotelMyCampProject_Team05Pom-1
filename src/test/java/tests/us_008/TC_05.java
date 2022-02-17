package tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {
    //"List of Reservations" sayfasindada
    // "+ADD ROOM RESERVATION " kismina erisim saglanabilmelidir.

    US_008Page us_008Page=new US_008Page();

    @Test
    public void testCase05() {
        extentTest=extentReports.createTest("ADD ROOM RESERVATION a erisim testi","ADD ROOM RESERVATION kismina erisim saglandi");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("ADD ROOM RESERVATION a tiklandi");
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

        //"+ADD ROOM RESERVATION" a tiklanir.
        us_008Page.addRoomReservationButton.click();

        //"Create Hotelroomreservatıon" yazisi görünür olmalidir.
        Assert.assertTrue(us_008Page.createHotelRoomreservationYazisi.isDisplayed());

    }
}
