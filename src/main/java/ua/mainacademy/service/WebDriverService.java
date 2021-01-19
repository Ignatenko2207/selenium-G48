package ua.mainacademy.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.mainacademy.util.TimeoutUtil;

import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class WebDriverService {

    public static WebDriver getWebDriver(String resource) {
        System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get(resource);
        TimeoutUtil.waitSeconds(3);
        return driver;
    }
}
