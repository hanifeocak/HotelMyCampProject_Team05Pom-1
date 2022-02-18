package tests.us_004;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_004;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {


    HMCPages hmcPages=new HMCPages();
    US_004 us_004=new US_004();


    //TC_002 Code,Name,Adress,Phone,Email bilgileri ilgili alana girilebilmeli
    @Test
    public void test02(){
        extentTest=extentReports.createTest("Ilgili alanlari doldurma testi",
                "yonetici ilgili kutucuklari gorup doldurmali");

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

    }



}
