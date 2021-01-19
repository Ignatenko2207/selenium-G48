package ua.mainacademy;

import org.openqa.selenium.WebDriver;
import ua.mainacademy.service.AmazonItemHandleService;
import ua.mainacademy.service.AmazonSearchService;
import ua.mainacademy.service.WebDriverService;

public class AppRunner {

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverService.getWebDriver("https://www.amazon.com");
        webDriver = AmazonSearchService.getSearchResultPage(webDriver, "iphone 8");
        if(AmazonSearchService.isItemPresent("B08KJJ56FV", webDriver)) {
            webDriver = AmazonSearchService.getItemPage("B08KJJ56FV", webDriver);
            webDriver = AmazonItemHandleService.addItemToCart(webDriver);
        }
        webDriver.quit();
    }

}
