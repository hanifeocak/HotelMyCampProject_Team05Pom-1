package tests.us_004;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_004;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {
    HMCPages hmcPages=new HMCPages();
    US_004 us_004=new US_004();




    //TC_001  'ADD HOTEL' butonu gorunur ve erisilebilir olmalidir.
    @Test
    public void test01(){
        extentTest=extentReports.createTest("yonetici hesabı olusturma islemi testi",
                "yonetici hesap olusturma islemlerini yapmasi gerekir");

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
    }

}
