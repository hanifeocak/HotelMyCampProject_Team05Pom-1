package tests.us_007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {

    @Test
    public void deleteTest() throws InterruptedException {
        extentTest=extentReports.createTest("propertiesSekmesiTesti",
                "yonetici oda detaylarini duzenler");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");
        US_007 hotelMyCampPage=new US_007();
        hotelMyCampPage.girisYap();

        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelRoomsLink.click();
        hotelMyCampPage.listOfHotelRoomsDetailsButton.click();
        extentTest.info("details butonuna tiklama basarili");

        //1."Edit Hotelroom" sayfasındaki "Delete" butonuna tıklanır.
        hotelMyCampPage.deleteButton.click();
        hotelMyCampPage.bekle(2);

        //2. Beliren pop-up'da "OK"  seçeneği tıklanır.
        hotelMyCampPage.deleteOkButton.click();
        extentTest.info("delete butonuna tiklama basarili");

        //3. Otel odası rezervasyonlu olarak veya silindi olarak alert çıkıyor ise "Delete" butonunun çalışır durumda olduğu kabul edilir.
        Assert.assertTrue(hotelMyCampPage.deleteSuccessfulAlert.isDisplayed());
        extentTest.pass("PASS");



    }
}
