package com.vertex.cm.handlewebsite;

import com.vertex.cm.pages.Home;
import drivermanager.DriverManager;
import managefile.PropertyAccesor;

public class LoadPage {
    public static Home loadGoogleHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new Home();
    }

    public static void main(String[] args) {
        loadGoogleHome().searchTextAndClickSearchButton("UPB cochabamba");
    }
}
