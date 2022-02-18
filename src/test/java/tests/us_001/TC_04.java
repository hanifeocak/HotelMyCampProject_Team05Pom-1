package tests.us_001;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.AnaSayfaButonlar;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_04 {

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropery("HMCUrl"));
        AnaSayfaButonlar anaSayfaButonlar = new AnaSayfaButonlar();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.instagramFoto1);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.instagramFoto1);
        Thread.sleep(1000);
        anaSayfaButonlar.instagramFotoClose.click();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.instagramFoto2);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.instagramFoto2);
        Thread.sleep(1000);
        anaSayfaButonlar.instagramFotoClose.click();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.instagramFoto3);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.instagramFoto3);
        Thread.sleep(1000);
        anaSayfaButonlar.instagramFotoClose.click();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.instagramFoto4);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.instagramFoto4);
        Thread.sleep(1000);
        anaSayfaButonlar.instagramFotoClose.click();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerBlog);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerBlog);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerRooms);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerRooms);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerAmenitiesTest);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerAmenitiesTest);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerGiftCard);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerGiftCard);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerCareer);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerCareer);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerAboutUs);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerAboutUs);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerContactUs);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerContactUs);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerServices);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerServices);
        Thread.sleep(1000);

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerTelefonNo);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerTelefonNo);
        Thread.sleep(1000);
        Driver.getDriver().navigate().back();

        Thread.sleep(2000);
        jse.executeScript("arguments[0].scrollIntoView(true);", anaSayfaButonlar.footerInfo);
        jse.executeScript("arguments[0].click();", anaSayfaButonlar.footerInfo);
        Thread.sleep(1000);


        Driver.getDriver().close();

    }

}
