package tests.us_002.us_005;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_005Pages;
import pages.US_010;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;
public class TC_01 extends TestBaseRapor {
    HMCPages hmcPages;
    US_005Pages us005Pages;
    @Test
    public  void test01() {
        extentTest=extentReports.createTest("kullanıcı hesabı olusturma islemi testi",
                "kullanıcı hesap olusturma islemlerini yapmasi gerekir");
        hmcPages = new HMCPages();
        us005Pages=new US_005Pages();
        //https://hotelmycamp.com/
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("HMCUrl'ye gidildi");
        //Sağ üstteki "Login"butonuna tıklayın
        hmcPages.firstLogInElement.click();
        extentTest.info("login butonuna tiklandi");
        //"Username" butonuna geçerli bir username girin
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //"Password" butonuna geçerli bir password girin
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPages.bekle(3);
        extentTest.info("userNameBoxElementine ve PaswordBoxElementine tiklandi");
        //"Login" Butonuna tıklayın
        hmcPages .secondLogInElement.click();
        //"Hotel Management" menüsüne tıklayın
        hmcPages.hotelManagementLink.click();
        //"Hotel List" menüsüne tıklayın
        hmcPages.hotelListLinki.click();
        extentTest.info("hotelManagementLinkine ve hotelList linkine tiklandi");
        //"List Of Hotels" başlığının görünürlüğünü kontrol edin
        Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());
        extentTest.info("List Of Hotels\" başlığının görünürlüğünü kontrol edildi");
        Driver.getDriver().close();
    }
}