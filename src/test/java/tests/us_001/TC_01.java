package tests.us_001;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnaSayfaButonlar;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class TC_01 {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnaSayfaButonlar anaSayfaButonlar = new AnaSayfaButonlar();
        anaSayfaButonlar.Home.click();
        anaSayfaButonlar.Rooms.click();
        Driver.getDriver().navigate().back();
        anaSayfaButonlar.Restaurant.click();
        Driver.getDriver().navigate().back();
        anaSayfaButonlar.About.click();
        Driver.getDriver().navigate().back();
        anaSayfaButonlar.Blog.click();
        Driver.getDriver().navigate().back();
        anaSayfaButonlar.Contact.click();
        Driver.getDriver().navigate().back();
        anaSayfaButonlar.Login.click();
        Driver.getDriver().close();
        Driver.closeDriver();

    }



}
