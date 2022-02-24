package tests.us_008;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_008Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_07 extends TestBaseRapor {
    //Yönetici olarak valid credentialler ile basarili bir rezervasyon eklenebilmeli ve
    //basarili bir rezervasyon saglanmalidir.

    HMCPages hmcPages;
    US_008Page us_008Page;

    @Test
    public void testCase07() throws InterruptedException {
        hmcPages=new HMCPages();
        us_008Page=new US_008Page();
        extentTest=extentReports.createTest("testCase07","valid credentialler ile basarili bir rezervasyon yapilamadi");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("Basarili rezervasyon saglanamadi");
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

        //"1-Birinci ""IDUser"" icin herhangi bir secim yapilmamalidir.
        // ikinci IDUser icin gerekli secim yapilir
        Select select2=new Select(us_008Page.idUser2DropdownElementi);
        select2.selectByIndex(3);

        // 2-""Price"" butonuna gecerli deger girilir.
        us_008Page.priceTextBox.sendKeys(ConfigReader.getProperty("HMCHotelPrice"));

        // 3-"DateStart" bölmesinden gecerli bir tarih secilir.
        us_008Page.dateStartBox.sendKeys(ConfigReader.getProperty("HMCDateStart"));
        Thread.sleep(6000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(5000);

        // 4-"DateEnd" bölmesinden gecerli bir tarih secilir.
        us_008Page.dateEndBox.sendKeys(ConfigReader.getProperty("HMCDateEnd"));

        // 5-"AdultAmount" butonuna gecerli sayi girilir.
        us_008Page.adultAmountBox.sendKeys(ConfigReader.getProperty("HMCAdultAmount"));

        // 6-"ChildrenAmount" butonuna gecerli sayi girilir.
        us_008Page.childrenAmountBox.sendKeys(ConfigReader.getProperty("HMCChildrenAmount"));

        // 7-"ContactNameSurname" bölmesine gecerli isim ve soyisim girilir.
        us_008Page.contactNameSurnameBox.sendKeys(ConfigReader.getProperty("HMCContactNameSurnameBox"));

        // 8-"ContactPhone" bölmesine 10 haneli gecerli bir telefon numarasi girilir.
        us_008Page.contactPhoneBox.sendKeys(ConfigReader.getProperty("HMCContactPhoneBox"));

        // 9-"Contact Email" bölmesine gecerli bir E-Mail adresi girilir.
        us_008Page.contactEmailBox.sendKeys(ConfigReader.getProperty("HMCContactEmailBox"));

        // 10-"Notes" bölmesine herhangi bir not girilir.
        us_008Page.notesTextBox.sendKeys(ConfigReader.getProperty("HMCNotesTextBox"));

        //11-"Approved" ve "I Paid" checkbox butonlarina tiklanir.
        us_008Page.approvedCheckBox.click();

        us_008Page.iPaidCheckBox.click();

        // 12-"SAVE" butonuna tiklanir ve rezervasyon yapilir.
        us_008Page.saveButton.click();

        Thread.sleep(5000);

        //"Select User" error yazisi görünür olmalidir.
        Assert.assertTrue(us_008Page.selectUserErrorYazisi.isDisplayed());



    }

}
