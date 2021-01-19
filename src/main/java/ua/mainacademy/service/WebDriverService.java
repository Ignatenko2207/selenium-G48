package ua.mainacademy.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ua.mainacademy.helper.PathHelper;
import ua.mainacademy.util.TimeoutUtil;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class WebDriverService {

    public static WebDriver getWebDriver(String resource) {
        PathHelper pathHelper = new PathHelper();
        System.setProperty("webdriver.chrome.driver", pathHelper.getChropmeDriverPath());
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get(resource);
        TimeoutUtil.waitSeconds(3);
        return driver;
    }
}
