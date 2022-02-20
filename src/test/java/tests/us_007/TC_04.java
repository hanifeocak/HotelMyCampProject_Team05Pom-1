package tests.us_007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor {
    @Test
    public void propertiesSekmesiEditTesti(){
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

        //1."Properties" sekmesine gidilir.
        hotelMyCampPage.propertiesSekmesi.click();

        hotelMyCampPage.bekle(2);

        Faker faker=new Faker();

        Actions actions=new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        extentTest.info("Properties sekmesine gidildi");

        //2."Tip" sekmesinden oda tipi seçilir
        Select select=new Select(hotelMyCampPage.propertiesTipDropdown);
        select.selectByIndex(3);

        //3. "Code", "Value" kısımlarına değerler girilir ve "Save" edilir.
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.number().digits(3))
                .sendKeys(Keys.TAB)
                .sendKeys("Tested by ofe")
                .perform();

        extentTest.info("ilgili alanlar dolduruldu");

        hotelMyCampPage.propertiesSaveButton.click();

        hotelMyCampPage.bekle(2);

        Assert.assertTrue(hotelMyCampPage.propertiesSaveControl.isDisplayed());

        extentTest.pass("PASS");
    }
}
