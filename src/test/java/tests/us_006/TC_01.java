package tests.us_006;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {


    @Test
    public void test01() {
        extentTest=extentReports.createTest("yonetici login testi",
                "yonetici oda olusturma islemlerini yapmasi gerekir");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("Url'e gidildi");
        HMCPages hmcPages = new HMCPages();

        WebElement firstLogInElement = hmcPages.firstLogInElement;

        hmcPages.firstLogInElement.click();
        //	test data username: manager ,
        hmcPages.userNameBoxElement.sendKeys("manager");
        //	test data password : Manager1!
        hmcPages.passwordBoxElement.sendKeys("Manager1!" + Keys.ENTER);
        // hmcPages.passwordBoxElement.click();

        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hmcPages.basariliGirisYapildi.isDisplayed());
        extentTest.pass("login olusturulup sayfaya gecildi");
        Actions actions = new Actions(Driver.getDriver());
        hmcPages.hotelManagementLink.click();
        hmcPages.hotelListLinki.click();
        hmcPages.addHotelLinki.click();
        actions.click(hmcPages.addHotelCodeBox)

                .sendKeys(Keys.TAB).perform();


    }

    }










