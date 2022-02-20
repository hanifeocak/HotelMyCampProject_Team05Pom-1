package tests.us_001;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnaSayfaButonlar;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

public class TC_02 extends TestBaseRapor {

    @Test
    public void ikinciGörev() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnaSayfaButonlar anaSayfaButonlar = new AnaSayfaButonlar();
        WebElement expectedResult= anaSayfaButonlar.welcomeToHotelmyCamp;
        Assert.assertTrue(expectedResult.isEnabled());

        TakesScreenshot tss=(TakesScreenshot) Driver.getDriver();
        File tumSayfaSS = new File("target/screenShot/tumsayfa.png");
        File geciciResim=tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,tumSayfaSS);
        Driver.closeDriver();


    }
}
