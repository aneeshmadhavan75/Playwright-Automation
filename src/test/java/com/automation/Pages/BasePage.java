package com.automation.Pages;

import com.automation.Utils.DriverManager;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.Locale;

public class BasePage {

    Page page;

    public BasePage(){
        page = DriverManager.getPage();
    }

    public boolean isPresent(Locator locator){
        return locator.isVisible();
    }

    public void clickIfPresent(Locator locator){
        if(isPresent(locator)){
            locator.click();
        }
    }
}
