package tests.us_007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {

    @Test
    public void detailsYonlendirmeTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HMCPages hotelMyCampPage=new HMCPages();
        hotelMyCampPage.girisYap();

        hotelMyCampPage.hotelManagementLink.click();
        hotelMyCampPage.hotelRoomsLink.click();

        Assert.assertTrue(hotelMyCampPage.listOfHotelRoomsDetailsButton.isDisplayed());

        Driver.closeDriver();
    }

}
