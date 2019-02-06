package tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {

    WebDriver driver;
    String url;

    @Test
    public void test1method() {
        url = "http://172.16.32.193:4444/wd/hub/";
        DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
        capabilities.setBrowserName(BrowserType.CHROME);
        capabilities.setPlatform(Platform.LINUX);
        try {
            driver = new RemoteWebDriver(new URL(url), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("http://test.salesforce.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
