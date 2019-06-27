package com.vertex.cm.stepdefinitions;

import com.vertex.cm.handlewebsite.LoadPage;
import cucumber.api.java.en.Given;

public class LoadPageStepDef {
    @Given("^load google page$")
    public void loadGooglePage() throws Throwable {
        LoadPage.loadGoogleHome();
    }
}
