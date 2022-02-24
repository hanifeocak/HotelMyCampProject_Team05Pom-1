package tests.us_006;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

public class TC_04TSS extends TestBaseRapor {
    HMCPages hmcPages;
    @Test
    public void test01() throws IOException {
        hmcPages = new HMCPages();
        extentTest=extentReports.createTest("yonetici login testi",
                "yonetici oda olusturma islemlerini yapmasi gerekir");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //  extentTest.info("Url'e gidildi");


        WebElement firstLogInElement = hmcPages.firstLogInElement;

        hmcPages.firstLogInElement.click();
        //	test data username: manager ,
        hmcPages.userNameBoxElement.sendKeys("manager");
        //	test data password : Manager1!
        hmcPages.passwordBoxElement.sendKeys("Manager1!" + Keys.ENTER);
        // hmcPages.passwordBoxElement.click();
        //   extentTest.info("Login olundu");
        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());
        hmcPages.hotelManagementLink.click();
        hmcPages.hotelListLinki.click();
        hmcPages.addHotelLinki.click();
        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(hmcPages.addHotelCodeBox)
                .sendKeys(faker.address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(faker.name().name()).
                //isim olmadan oda girisi yapilamadi
                        sendKeys(Keys.TAB).
                sendKeys(faker.address().country()).
                sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().phoneNumber()).
                //telefon numarasi olamadan oda girisi yapilamadi
                        sendKeys(Keys.TAB).
                sendKeys(Keys.PAGE_DOWN).//perform();
                sendKeys(faker.internet().emailAddress()).perform();
        //email adresi olmadan oda girisi yapilamadi

        TakesScreenshot tss = (TakesScreenshot) Driver.getDriver();
        File tumsayfass = new File("src/screenshot.png");
        File geciciresim = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciresim, tumsayfass);
        hmcPages.bekle(3);

    }
}