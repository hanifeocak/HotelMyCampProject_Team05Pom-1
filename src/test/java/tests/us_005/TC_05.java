package tests.us_005;

import org.openqa.selenium.Keys;
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

public class TC_05 extends TestBaseRapor {
    US_005Pages us005Pages=new US_005Pages();
    @Test
public  void reservasyonBilgiTabloTesti() {
        extentTest=extentReports.createTest("urlye gidildi");
    //https://hotelmycamp.com/
    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    //Sağ üstteki "Login"butonuna tıklayın
    HMCPages hmcPages = new HMCPages();
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
        extentTest=extentReports.createTest("\"List Of Hotels\" başlığının görünürlüğünü kontrol edin");
    Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());
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
        hmcPages.bekle(3);
        Assert.assertTrue(us005Pages.contiuneYaziElementi.isDisplayed());
        us005Pages.okButonElementi.click();
}
}
