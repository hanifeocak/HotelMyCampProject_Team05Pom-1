package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
<<<<<<< HEAD

=======
>>>>>>> 0c3a1fa79e31bbc35db493f186923608e14d252e
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestBaseRapor {
<<<<<<< HEAD
=======

>>>>>>> 0c3a1fa79e31bbc35db493f186923608e14d252e
    protected static ExtentReports extentReports; //extent report'a ilk atamayi yapar
    protected static ExtentTest extentTest; // test pass veya failed gibi bilgileri kaydeder. Ayrica ekran resmi icin de kullaniriz
    protected static ExtentHtmlReporter extentHtmlReporter; // Html raporu duzenler
    // Test işlemine başlamadan hemen önce (test methodundan önce değil, tüm test işleminden önce)
    @BeforeTest(alwaysRun = true) // alwaysRun : her zaman çalıştır.
    public void setUpTest() {
<<<<<<< HEAD
        extentReports = new ExtentReports();
=======
        extentReports = new ExtentReports(); // Raporlamayi baslatir
>>>>>>> 0c3a1fa79e31bbc35db493f186923608e14d252e
        //rapor oluştuktan sonra raporunuz nereye eklensin istiyorsanız buraya yazıyorsunuz.
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/Rapor"+date+".html";
        //oluşturmak istediğimiz raporu (html formatında) başlatıyoruz, filePath ile dosya yolunu belirliyoruz.
        extentHtmlReporter = new ExtentHtmlReporter(filePath);
        extentReports.attachReporter(extentHtmlReporter);
<<<<<<< HEAD

        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
        extentReports.setSystemInfo("Automation Engineer", "Omer");
        extentHtmlReporter.config().setDocumentTitle("Son Test");
        extentHtmlReporter.config().setReportName("TestNG Reports");
=======
        // İstediğiniz bilgileri buraya ekeyebiliyorsunuz.
        extentReports.setSystemInfo("Enviroment","QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser")); // chrome, firefox
        extentReports.setSystemInfo("Automation Engineer", "Emrah");
        extentHtmlReporter.config().setDocumentTitle("Son Test");
        extentHtmlReporter.config().setReportName("TestNG Report");
>>>>>>> 0c3a1fa79e31bbc35db493f186923608e14d252e
    }
    // Her test methodundan sonra eğer testte hata varsa, ekran görüntüsü alıp rapora ekliyor
    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) { // eğer testin sonucu başarısızsa
            String screenshotLocation = ReusableMethods.getScreenshot(result.getName());
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) { // eğer test çalıştırılmadan geçilmezse
            extentTest.skip("Test Case is skipped: " + result.getName()); // Ignore olanlar
        }
        Driver.closeDriver();
    }
    // Raporlandırmayı sonlandırmak icin
    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        extentReports.flush();
    }
}
<<<<<<< HEAD
=======

>>>>>>> 0c3a1fa79e31bbc35db493f186923608e14d252e
