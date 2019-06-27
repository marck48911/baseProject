package com.vertex.cm.pages;

import com.vertex.cm.managepage.BasePage;
import manageevents.Events;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage {

    @FindBy(xpath = "")
    private WebElement searchTextField;

    @FindBy(css = "")
    private WebElement searchButton;

    public Home searchText(String text){
        Events.fillField(searchTextField, text);
        return this;
    }

    public void clickSearchButton(){
        Events.click(searchButton);
    }

    public void searchTextAndClickSearchButton(String text){
        searchText(text).clickSearchButton();
    }
}
