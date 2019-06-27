package manageevents;

import drivermanager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Events {
    public static void click(WebElement webElement){
        webElement.click();
    }
    public static void click(By by){
        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        searchTextField.sendKeys(text);
    }
}
