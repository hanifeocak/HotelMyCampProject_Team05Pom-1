package tests.us_004;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_004;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_07 extends TestBaseRapor {
    HMCPages hmcPages = new HMCPages();
    US_004 us_004 = new US_004();
    //TC_005 "hotel was inserted successfully" yazısını görebilmeli ve "ok" butonu tıklanabilir olmalı
    @Test
    public void test07() throws InterruptedException {
        HMCPages hmcPages=new HMCPages();
        US_004 us_004=new US_004();
        extentTest=extentReports.createTest("unique kayit testi ",
                "unique bir sonuc oldugu test edilmeli");
        //1- Yonetici url e gider.
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");
        //2- Login butonunu tiklar.
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tiklandi");
        //3- Yonetici kendisine verilen username ve password ile giris yapar.
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPages.secondLogInElement.click();
        extentTest.info("Gecerli username ve password ile giris yapildi");
        //4- "Hotel management" kismina tiklar.
        hmcPages.hotelManagementLink.click();
        extentTest.info("Hotel management linkine tiklandi");
        //5- Gorunur hale gelen "Hotel List" kismina tiklar.
        hmcPages.hotelListLinki.click();
        extentTest.info("Hotel List linkine tiklandi");
        //6- "Add Hotel" butonuna erisebilir.
        Assert.assertTrue(hmcPages.addHotelLinki.isDisplayed());
        extentTest.info("Add hotel kisminin gorunur oldugu goruldu");
        us_004.addHotelButton.click();
        //7-"Code" kutucuğuna tıklayıp bir Kod giriniz
        hmcPages.addHotelCodeBox.sendKeys("187150015");
        extentTest.info("Code kutucuguna veri gonderildi");
        //8-"Name" kutucuğuna tıklayıp bir İsim giriniz
        us_004.createHotelNameBox.sendKeys("Oguzhan");
        extentTest.info("Name kutucuguna veri gonderildi");
        //9-"Adress" kutucuğuna tıklayıp Adres giriniz
        us_004.createHotelAddressBox.sendKeys("13313 cutten rd #3201");
        extentTest.info("Adress kutucuguna veri gonderildi");
        //10-"Phone" kutucuğuna tıklayıp Telefon Numarası giriniz
        us_004.createHotelPhoneBox.sendKeys("8325604012");
        extentTest.info("Phone kutucuguna veri gonderildi");
        //11-"Mail" kutucuğuna tıklayıp Email Adresi giriniz
        us_004.createHotelEmailBox.sendKeys("yucedalo@gmail.com");
        extentTest.info("Email kutucuguna veri gonderildi");
        //12-"IDGroup" dropdown butonuna tıklayıp Grup seçiniz
        us_004.createHotelDropdownButton();
        extentTest.info("IDGroup dropdown secenegi secildi");
        //13-"Save" butonuna tıklayın
        Thread.sleep(5000);
        us_004.createHotelSaveBox.click();
        extentTest.info("Save butonuna basildi");
        //14-"HotelRoom was inserted successfully" yazısının görünürlüğü test edilmeli
        Thread.sleep(5000);
        Assert.assertTrue(us_004.createHotelWasInsertedSuccessfullyText.isDisplayed());
        extentTest.info("HotelRoom was inserted successfully yazisi gorundugu test edildi");
        //15-"OK" butonuna tıklayın ve otel listesini tıklayın
        us_004.createHotelWasInsertedSuccessfullyOkButton.click();
        extentTest.info("Ok butonuna tiklandi ve otel listesine tiklandi");
        //16-"IDGroup" kutusuna otel kayıt yaptığınız otel "id" giriniz
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        hmcPages.hotelListLinki.click();
        us_004.listOfHotelsCodeButton.sendKeys("187150015");
        extentTest.info("IDGroup kutusuna kayit yaptigimiz otel id ile giris yapildi ");
        //17-"Search" butonuna tıklayın ve unique bir kaydın yapılıp yapılmadıgını dogrulayın
        us_004.listOfHotelsSearchButton.click();
        Assert.assertTrue(us_004.listOfHotelUniqueSearch.isEnabled());
        extentTest.info("Search butonuna basildi ve uniuqe bir kayit oldugu goruldu ");
    }
}