package drivermanager;

import manageevents.Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private DriverFactory(){}

        public static WebDriver getWebDriver(BrowserType browserType){
        Map<BrowserType, Browser> browserPickUp = new HashMap<>();
        browserPickUp.put(BrowserType.CHROME, new Chrome());
        return browserPickUp.get(browserType).initializeDriver();
    }

    public static void main(String[] args) {
        DriverFactory a = new DriverFactory();
        a.getWebDriver(BrowserType.CHROME)
                .findElement(
                        By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")
                ).sendKeys();

        a.getWebDriver(BrowserType.CHROME).quit();

        Events.click(By.xpath(""));
    }
}
