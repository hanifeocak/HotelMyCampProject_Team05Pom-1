package tests.us_007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {

    @Test
    public void detailsYonlendirmeTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HMCPages hotelMyCampPage=new HMCPages();
        hotelMyCampPage.girisYap();

        hotelMyCampPage.hotelManagementLink.click();
        hotelMyCampPage.hotelRoomsLink.click();
        hotelMyCampPage.listOfHotelRoomsDetailsButton.click();

        Assert.assertTrue(hotelMyCampPage.detailsGirisKontrol.isDisplayed());

        Driver.closeDriver();
    }

}
