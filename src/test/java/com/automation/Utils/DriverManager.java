package com.automation.Utils;

import com.microsoft.playwright.*;

public class DriverManager {

    static Playwright playwright;
    static Page page;

    public static void createDriver(){
        playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(100));

        BrowserContext context = browser.newContext();

        page = context.newPage();
    }

    public static Page getPage(){
        return page;
    }

    public static void quit(){
        playwright.close();
    }

}
