package utilities;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private Driver(){

    }
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

<<<<<<< HEAD
    public static void closeDriver(){
=======
<<<<<<< HEAD
<<<<<<< HEAD
        public static void closeDriver(){
=======
    public static void closeDriver(){
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
=======
    public static void closeDriver(){
>>>>>>> Ayse
>>>>>>> eefaef94da1ca4d010e2ccf3c59f1e1e6c2d4935
        if( driver != null){
          driver.quit();
            driver = null;
<<<<<<< HEAD
      }  }
=======
        }
=======
       if( driver != null){
           driver.quit();
           driver = null;
       }
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    }



