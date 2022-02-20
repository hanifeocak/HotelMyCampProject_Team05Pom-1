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
    public void test04() throws InterruptedException {
        extentTest=extentReports.createTest("kullanıcı hesabı olusturma islemi testi",
                "kullanıcı hesap olusturma islemlerini yapmasi gerekir");
        //1- Yonetici url e gider.
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //2- Login butonunu tiklar.
        hmcPages.firstLogInElement.click();
        //3- Yonetici kendisine verilen username ve password ile giris yapar.
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPages.secondLogInElement.click();
        //4- "Hotel management" kismina tiklar.
        hmcPages.hotelManagementLink.click();
        //5- Gorunur hale gelen "Hotel List" kismina tiklar.
        hmcPages.hotelListLinki.click();
        //7- "Add Hotel" butonuna erisebilir.
        Assert.assertTrue(hmcPages.addHotelLinki.isDisplayed());
        hmcPages.addHotelLinki.click();
        //7-"Code" kutucuğuna tıklayıp bir Kod giriniz
        hmcPages.addHotelCodeBox.sendKeys("187150015");
        //8-"Name" kutucuğuna tıklayıp bir İsim giriniz
        us_004.createHotelNameBox.sendKeys("Oguzhan");
        //9-"Adress" kutucuğuna tıklayıp Adres giriniz
        us_004.createHotelAddressBox.sendKeys("13313 cutten rd #3201");
        //10-"Phone" kutucuğuna tıklayıp Telefon Numarası giriniz
        us_004.createHotelPhoneBox.sendKeys("8325604012");
        //11-"Mail" kutucuğuna tıklayıp Email Adresi giriniz
        us_004.createHotelEmailBox.sendKeys("yucedalo@gmail.com");
        //12-"IDGroup" dropdown butonuna tıklayıp Grup seçiniz
        us_004.createHotelDropdownButton();
        //13-"Save" butonuna tıklayın
        Thread.sleep(2000);
        us_004.createHotelSaveBox.click();
        //14-"HotelRoom was inserted successfully" yazısının görünürlüğü test edilmeli
        Thread.sleep(2000);
        Assert.assertTrue(us_004.createHotelWasInsertedSuccessfullyText.isDisplayed());
        //15-"OK" butonuna tıklayın ve otel listesini tıklayın
        us_004.createHotelWasInsertedSuccessfullyOkButton.click();
        //16-"IDGroup" kutusuna otel kayıt yaptığınız otel "id" giriniz
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        hmcPages.hotelListLinki.click();
        us_004.listOfHotelsCodeButton.sendKeys("187150015");
        //17-"Search" butonuna tıklayın ve unique bir kaydın yapılıp yapılmadıgını dogrulayın
        us_004.listOfHotelsSearchButton.click();
        Assert.assertTrue(us_004.listOfHotelUniqueSearch.isEnabled());
        actions.moveToElement(hmcPages.kullaniciAdiElement).perform();
        hmcPages.logOut.click();
        actions.moveToElement(hmcPages.kullaniciAdiElement).perform();
        hmcPages.logOut.click();

    }
}