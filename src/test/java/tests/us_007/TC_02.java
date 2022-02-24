package tests.us_007;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.US_007;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    US_007 hotelMyCampPage;

    @Test
    public void detailsEditGecisTesti(){
        hotelMyCampPage=new US_007();
        extentTest=extentReports.createTest("detailsEditGecisTesti",
                "yonetici details butonu ile duzenleme alanina gider");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");
        hotelMyCampPage.girisYap();

        //1."LIST OF HOTELROOMS" tablosundaki herhangi bir satırdaki "DETAILS" butonuna tıklanır.
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelRoomsLink.click();
        hotelMyCampPage.listOfHotelRoomsDetailsButton.click();
        extentTest.info("details butonuna tiklama basarili");


        Assert.assertTrue(hotelMyCampPage.detailsGirisKontrol.isDisplayed());
        extentTest.pass("PASS");

        Driver.closeDriver();
    }

}
