package tests.us_007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {

    @Test
    public void editHotelRoomsTesti(){
        extentTest=extentReports.createTest("editHotelRoomsTesti",
                "yonetici oda detaylarini duzenler");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url'e gidildi");
        US_007 hotelMyCampPage=new US_007();
        hotelMyCampPage.girisYap();

        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.hotelRoomsLink.click();
        hotelMyCampPage.listOfHotelRoomsDetailsButton.click();
        extentTest.info("details butonuna tiklama basarili");

        //1."Hotel" sekmesinden ilgili hotel seçeneği seçilir.

        Select select=new Select(hotelMyCampPage.selectHotelDropdown);
        select.selectByIndex(6);

        //2."Code","Name","Locatıon","Description" ve "Price" ile iligili düzenlemeler girilir.
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.country().name())
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();

        actions.click(hotelMyCampPage.editTestArea);
        actions.sendKeys(faker.lorem().paragraph())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.commerce().price(100,900))
                .sendKeys(Keys.TAB)
                        .perform();

        //3."Room Type" sekmesinden oda tipi seçilir.

        select=new Select(hotelMyCampPage.selectRoomType);
        select.selectByIndex(4);

        //4. "Max Adult Count","Max Children Count" ile ilgili düzenlemeler girilir.
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.number().digits(1))
                        .sendKeys(Keys.TAB)
                                .sendKeys(faker.number().digits(1))
                                        .perform();
        extentTest.info("ilgili alanlar dolduruldu");

        //5. "isAvaible" ikonu aktif hale getirilir.

        if (!hotelMyCampPage.isAvailebleCheckBox.isSelected()){
            actions.click(hotelMyCampPage.isAvailebleCheckBox).perform();
    }

        extentTest.info("isAvaible check box aktif");

        hotelMyCampPage.editPageSaveButton.click();

        hotelMyCampPage.bekle(3);

        Assert.assertTrue(hotelMyCampPage.saveSuccessful.isDisplayed());

        extentTest.pass("PASS");

    }
}
