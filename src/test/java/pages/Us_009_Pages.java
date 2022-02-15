package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us_009_Pages {
    public Us_009_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
























    public void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
