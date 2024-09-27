package com.automation.Pages;


import com.automation.Utils.ConfigReader;
import com.microsoft.playwright.Locator;

public class HomePage extends BasePage{

    Locator followUsText;
    Locator goToTopBtn;
    Locator ajioLogo;
    Locator locationPopupCloseBtn;

    public HomePage(){
        followUsText = page.locator("xpath = //strong[normalize-space()='Follow us']");
        goToTopBtn = page.locator("xpath = //aside[@data-testid='react-scroll-up-button']");
        ajioLogo = page.locator("//img[@alt='Ajio logo']");
        locationPopupCloseBtn = page.getByLabel("close icon");
    }

    public void openWebsite(){
        page.navigate(ConfigReader.getConfigValue("website"));
    }

    public void goingUpAndDown(){
        if(locationPopupCloseBtn.isVisible()){
            locationPopupCloseBtn.click();
        }

        followUsText.scrollIntoViewIfNeeded();

    }

    public void clickArrowBtn(){
//        if (goToTopBtn.isVisible()){
//            goToTopBtn.click();
//        }
        clickIfPresent(goToTopBtn);
    }

    public Locator getAjioLogo(){
        return ajioLogo;
    }
}
