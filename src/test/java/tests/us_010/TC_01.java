package tests.us_010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_010;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {



    @Test
    public void kullanıcıHesabıOlusturmaIslemiTesti(){


        extentTest=extentReports.createTest("kullanıcı hesabı olusturma islemi testi",
                "kullanıcı hesap olusturma islemlerini yapmasi gerekir");



        HMCPages hmcPages=new HMCPages();
        US_010 us010 = new US_010();


        //1- Kullanıcı URL gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");



        //2- Log in butonuna basar
        hmcPages.firstLogInElement.click();
        extentTest.info("Log in butonuna tiklandi");

        //3- Create a new account sayfasına gider
        us010.createNewButton.click();
        extentTest.info("Create a new account sayfasına gidildi");

        //4- Tum bilgileri doldurur
        us010.createUsername.sendKeys(ConfigReader.getProperty("US010_username"));
        us010.createPassword.sendKeys(ConfigReader.getProperty("US010_password"));
        us010.createEmail.sendKeys(ConfigReader.getProperty("US010_email"));
        us010.createFullName.sendKeys(ConfigReader.getProperty("US010_Fullname"));
        us010.createPhone.sendKeys(ConfigReader.getProperty("US010_phohe"));
        us010.createSSN.sendKeys(ConfigReader.getProperty("US010_SSN"));
        us010.createDrivingLic.click();
        us010.createDrivingLic.sendKeys(ConfigReader.getProperty("US010_DL"));
        us010.createDrivingLic.sendKeys(ConfigReader.getProperty("US010_DL"));
        Select selectCountry=new Select(us010.selectCountry);
        selectCountry.selectByVisibleText(ConfigReader.getProperty("US010_Country"));
        Select selectState=new Select(us010.selectState);
        selectState.selectByVisibleText(ConfigReader.getProperty("US010_State"));
        us010.createAddress.sendKeys(ConfigReader.getProperty("US010_Adress"));
        us010.createWorkingSector.sendKeys(ConfigReader.getProperty("US010_WS"));
        us010.createBithDate.sendKeys(ConfigReader.getProperty("US010_Bdate"));
        us010.createSSN.sendKeys(ConfigReader.getProperty("US010_SSN"));
        us010.createWorkingSector.click();
        extentTest.info("Tum bilgiler girildi");

        //5- Save butonuna basar
        us010.createSaveButton.click();
        hmcPages.bekle(3);
        extentTest.info("Save butonuna basildi");

        //6- "User Data was inserted successfully" yazısını gorur
        String actualText= us010.createUyariYazisi.getText();
        String expectedText= "User Data was inserted successfully";
        Assert.assertEquals(actualText, expectedText);
        extentTest.pass("Kayıt basariyla gerceklestirildi");

        //7- OK butonuna basar
        us010.createOKButonu.click();



    }

}
