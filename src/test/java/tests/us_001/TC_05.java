package tests.us_001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AnaSayfaButonlar;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_05 {

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        AnaSayfaButonlar anaSayfaButonlar = new AnaSayfaButonlar();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        Thread.sleep(2000);
        anaSayfaButonlar.checkinDate.click();
        Thread.sleep(2000);
        WebElement giristarihsec=Driver.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[1]"));
        giristarihsec.click();
        Thread.sleep(1000);
        anaSayfaButonlar.checkOutDate.click();
        WebElement cikisTarihSec=Driver.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[2]"));
        Thread.sleep(1000);
        cikisTarihSec.click();

        Thread.sleep(1000);
        WebElement roomTypeSelect=anaSayfaButonlar.roomType;
        Select select=new Select(roomTypeSelect);
        select.selectByIndex(2);
        Thread.sleep(1000);
        WebElement customerSelect=anaSayfaButonlar.customer;
        select=new Select(customerSelect);
        select.selectByIndex(4);
        Thread.sleep(1000);
        anaSayfaButonlar.checkAvailability.click();
        Driver.closeDriver();
    }
}
