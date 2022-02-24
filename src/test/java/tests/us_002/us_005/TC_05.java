package tests.us_002.us_005;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US_005Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import java.io.File;
import java.io.IOException;
public class TC_05 extends TestBaseRapor {
    HMCPages hmcPages;
    US_005Pages us005Pages;
    @Test
    public  void reservasyonBilgiTabloTesti() throws IOException {
        hmcPages = new HMCPages();
        us005Pages=new US_005Pages();
        extentTest=extentReports.createTest("urlye gidildi");
        //https://hotelmycamp.com/
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //Sağ üstteki "Login"butonuna tıklayın
        hmcPages.firstLogInElement.click();
        //"Username" butonuna geçerli bir username girin
        hmcPages.userNameBoxElement.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest=extentReports.createTest("usurname goruldu");
        //"Password" butonuna geçerli bir password girin
        hmcPages.passwordBoxElement.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPages.bekle(3);
        //"Login" Butonuna tıklayın
        hmcPages.secondLogInElement.click();
        //"Hotel Management" menüsüne tıklayın
        hmcPages.hotelManagementLink.click();
        //"Hotel List" menüsüne tıklayın
        hmcPages.hotelListLinki.click();
        //"List Of Hotels" başlığının görünürlüğünü kontrol edin
        Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());
        extentTest=extentReports.createTest("\"List Of Hotels\" başlığının görünürlüğünü kontrol edildi");
        //"Details" butonuna tıklayın
        us005Pages.detailsButonElementi.click();
        //"Edit Hotel" başlığının görünürlüğünü kontrol edin
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        Assert.assertTrue(us005Pages.editHotelYaziElementi.isDisplayed());
        //"Code" kutucuğuna tıklayıp bir Kod giriniz
        us005Pages.codeKutusuElementi.sendKeys("0003");
        //"Name" kutucuğuna tıklayıp bir İsim giriniz
        us005Pages.nameKutusuElementi.sendKeys("falezyaliyar");
        //"Adress" kutucuğuna tıklayıp Adres giriniz
        us005Pages.addressKutusuElementi.sendKeys("gayret mahallesi umut sokaka no 1");
        //"Phone" kutucuğuna tıklayıp Telefon Numarası giriniz
        us005Pages.phoneKutusuElementi.sendKeys("5551234567");
        //"Mail" kutucuğuna tıklayıp Email Adresi giriniz
        us005Pages.emailKutusuElementi.sendKeys("falezyaliyar@gmail.com");
        //"Group" dropdown butonuna tıklayıp Grup seçiniz
        Select select = new Select(us005Pages.dropdownElementi);
        select.selectByIndex(1);
        //"Save" butonuna tıklayın
        us005Pages.saveButonElementi.click();
        //"Hotel was updated successfully" yazısının görünürlüğünü kontrol et
        hmcPages.bekle(3);
// "Edit Hotel" başlığının görünürlüğünü kontrol edin
        Assert.assertTrue(us005Pages.editHotelYaziElementi.isDisplayed());
        //"Ok" Butonuna tıkla
        us005Pages.okButonElementi.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        us005Pages.deleteButonElementi.click();
        extentTest.info("delete butonuna tiklandi");
        hmcPages.bekle(3);
        Assert.assertTrue(us005Pages.contiuneYaziElementi.isDisplayed());
        extentTest.pass("contiuneYaziElementi gorunurlugu test edildi");
        us005Pages.okButonElementi.click();
        TakesScreenshot tss = (TakesScreenshot) Driver.getDriver();
        File tumsayfass = new File("src/screenshot.png");
        File geciciresim = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciresim, tumsayfass);
    }
}