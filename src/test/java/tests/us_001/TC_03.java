package tests.us_001;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AnaSayfaButonlar;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {
    AnaSayfaButonlar anaSayfaButonlar;
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        anaSayfaButonlar = new AnaSayfaButonlar();
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();

        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true);",anaSayfaButonlar.room1);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",anaSayfaButonlar.room1);
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();

        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true);",anaSayfaButonlar.room2);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",anaSayfaButonlar.room2);
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();

        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true);",anaSayfaButonlar.room3);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",anaSayfaButonlar.room3);
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();

        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true);",anaSayfaButonlar.room4);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",anaSayfaButonlar.room4);
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();

        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true);",anaSayfaButonlar.room5);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",anaSayfaButonlar.room5);
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();

        Thread.sleep(3000);
        jse.executeScript("arguments[0].scrollIntoView(true);",anaSayfaButonlar.room6);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();",anaSayfaButonlar.room6);
        Thread.sleep(2000);
        Driver.getDriver().navigate().back();
        Driver.closeDriver();



//     Thread.sleep(3000);
//
//        WebElement ourRooms = driver.findElement(By.xpath("(//a[text()='View Room Details '])[1]"));
//
//        jse.executeScript("arguments[0].scrollIntoView(true);",ourRooms);
//
//        Thread.sleep(4000);
//
//        jse.executeScript("arguments[0].click();",ourRooms);
//
//        Thread.sleep(4000)
//
//    @Test
//    public void test02() throws InterruptedException {
//
//        JavascriptExecutor jse= (JavascriptExecutor) driver;
//
//        driver.get("https://www.koalaresorthotels.com");
//
//        Thread.sleep(3000);
//
//        WebElement ourRooms = driver.findElement(By.xpath("(//a[text()='View Room Details '])[1]"));
//
//        jse.executeScript("arguments[0].scrollIntoView(true);",ourRooms);
//
//        Thread.sleep(4000);
//
//        jse.executeScript("arguments[0].click();",ourRooms);
//
//        Thread.sleep(4000);
//    }
//
//}

    }
}
