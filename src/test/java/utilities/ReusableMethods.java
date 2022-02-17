package utilities;
<<<<<<< HEAD


=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.*;
=======
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

=======
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
<<<<<<< HEAD
import java.util.Random;
import java.util.function.Function;
public class ReusableMethods {
=======
<<<<<<< HEAD
import java.util.Random;
import java.util.function.Function;
public class ReusableMethods {
=======
<<<<<<< HEAD
import java.util.Random;
import java.util.function.Function;
public class ReusableMethods {

    public static String getScreenshot(String name) throws IOException {

        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);

        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);

=======
<<<<<<< HEAD
import java.util.function.Function;

=======
import java.util.Random;
import java.util.function.Function;
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
public class ReusableMethods {

>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }
<<<<<<< HEAD
    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
=======
<<<<<<< HEAD
    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
=======
<<<<<<< HEAD

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {

        String origin = Driver.getDriver().getWindowHandle();

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD


=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
        return element;
    }
}

<<<<<<< HEAD

=======
=======
<<<<<<< HEAD

        return element;
    }
=======
<<<<<<< HEAD

        return element;
    }
    public void elementiGoreneKadarKaydirVeTikla(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView()",element);
        jse.executeScript("arguments[0].click();", element);
    }
=======
        return element;
    }
>>>>>>> 9dca7b638a4088fbb6ab179c49d9dfe605d329e1
>>>>>>> 2f3d9805d9a4862e8f595348d410ea629109d617
}
>>>>>>> 3c6e3a84df0bdff6e59d15debff1ec0a9099aa7f
>>>>>>> 84ed54ae27564eb306e289377de71baa47eca224
