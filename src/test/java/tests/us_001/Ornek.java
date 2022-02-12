package tests.us_001;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Ornek {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getPropery("HMCUrl"));

    }
}
