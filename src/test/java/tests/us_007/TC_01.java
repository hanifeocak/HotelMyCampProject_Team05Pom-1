package tests.us_007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {
    US_007 hotelMyCampPage;

    @Test
    public void detailsYonlendirmeTesti(){
        hotelMyCampPage=new US_007();
        extentTest=extentReports.createTest("detailsYonlendirmeTesti",
                "yonetici details butonuna tiklar");
        //1. "https://www.hotelmycamp.com/" Url'ine login yapılır.
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");
        hotelMyCampPage.girisYap();

        // 2."Hotel Management" sekmesinden "Hotel Rooms" butonuna tıklanır.
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelRoomsLink.click();
        extentTest.info("details butonuna tiklama basarili");

        Assert.assertTrue(hotelMyCampPage.listOfHotelRoomsDetailsButton.isDisplayed());
        extentTest.pass("PASS");


        Driver.closeDriver();
    }

}
