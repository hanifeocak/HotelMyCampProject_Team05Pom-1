package tests.us_004;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_004;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_05 extends TestBaseRapor {
    HMCPages hmcPages=new HMCPages();
    US_004 us_004=new US_004();
    //TC_003 IDGroup dropdown secenegi ve Save butonunun calistigi kontrol edilip test edilmeli
    @Test
    public void test03(){
        HMCPages hmcPages=new HMCPages();
        US_004 us_004=new US_004();
        extentTest=extentReports.createTest("Yonetici IDGroup dropdown ve save testi",
                "Yonetici IDGroup dropdown ve save calistigini kontrol etmeli ");
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
        us_004.createHotelSaveBox.click();
        extentTest.info("Save butonuna basildi");

    }
}