package tests.us_003;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPages;
import pages.US003Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_003 extends TestBaseRapor {
    HMCPages hmcPages;
    US003Pages us003Pages;
    static WebDriver driver;
    static Select select;
    static Select select2;

    @Test
    public void test03() throws InterruptedException {
        // 3-Basvuru formuna erisilebilmelidir.

        //1- Username test datasi girilir.
        //2- Password test datasi girilir.
        //3- Email test datasi girilir.
        //4- Full Name test datasi girilir.
        //5- Phone Number test datasi girilir.
        //6- Social Security Number test datasi girilir.
        //7- Driving Licence test datasi girilir.
        //8- Country test datasi secilir.
        //9- State test datasi secilir.
        //10- Address test datasi secilir.
        //11- Working Sector test datasi girilir.
        //12- Birth Date test datasi girilir.
        //13- Save butonuna basilir.



        extentTest=extentReports.createTest("TC_003","3.Basvuru Tormu Testi");

        hmcPages=new HMCPages();
        us003Pages=new US003Pages();
        Actions actions = new Actions(Driver.getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hmcPages.firstLogInElement.click();
        us003Pages.createNewAccountButton.click();


        //1- Username test datasi girilir.
        us003Pages.registrationFromUsername.sendKeys("Emre188887920");
        extentTest.info("Username girildi");

        //2- Password test datasi girilir.
        us003Pages.registrationFromPassword.sendKeys("Istanbul34*");
        extentTest.info("Password girildi");

        //3- Email test datasi girilir.
        us003Pages.registrationFromEmail.sendKeys("emre17920888@techproed.com");
        extentTest.info("email girildi");

        //4- Full Name test datasi girilir.
        us003Pages.registrationFromFullName.sendKeys("Emre Gul");
        extentTest.info("Full Name girildi");

        //5- Phone Number test datasi girilir.
        us003Pages.registrationFromPhoneNo.sendKeys("1111111111");
        extentTest.info("Phone Number girildi");

        //6- Social Security Number test datasi girilir.
        us003Pages.RegistrationFromSSN.sendKeys("111111111");
        extentTest.info("SSN girildi");

        //7- Driving Licence test datasi girilir.
        us003Pages.registrationFromDriverLicence.click();
        us003Pages.registrationFromDriverLicence.sendKeys("B");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Driver Licence girildi");

        //8- Country test datasi secilir.
        select= new Select(us003Pages.registrationFromCountry);
        select.selectByValue("251");
        extentTest.info("Country girildi");

        //9- State test datasi secilir.
        select2= new Select(us003Pages.registrationFromState);
        select2.selectByValue("309");
        extentTest.info("State girildi");

        //10- Address test datasi secilir.
        us003Pages.registrationFromAddress.sendKeys("Austin, TX 78712, United States");
        extentTest.info("Address girildi");

        //11- Working Sector test datasi girilir.
        us003Pages.registrationFromWorkingSector.sendKeys("IT");
        extentTest.info("Working Sector girildi");

        //12- Birth Date test datasi girilir.
        us003Pages.registrationFromBirthDate.sendKeys("30/01/1988");
        extentTest.info("Birth Date girildi");

        //13- Save butonuna basilir.
        us003Pages.registrationFromSave.click();
        extentTest.info("Save Edildi.");

        ReusableMethods.waitFor(3);

        String actualSaveText=us003Pages.alertSavedMessage.getText();
        String expectedSaveText="User Data was inserted successfully";

        Assert.assertEquals(actualSaveText,expectedSaveText,"Profil olusturulamadi");
        us003Pages.alertMessageOk.click();


        extentTest.pass("Profil olusturuldu.");
    }


}
