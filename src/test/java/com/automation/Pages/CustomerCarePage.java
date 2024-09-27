package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import com.microsoft.playwright.Locator;

public class CustomerCarePage extends BasePage{

    Locator customerCareMenu;
    Locator issueSelection;
    String topicSelectString = "//label[contains(text(), '%s')]";
    Locator finalMsg;
    Locator locationPopupCloseBtn;



    public CustomerCarePage(){
        customerCareMenu = page.locator("xpath = //li/a[@aria-label='Customer Care']");
        issueSelection = page.locator("xpath = //div[@class='qa-content section-two col-sm-4']/div/section[1]");
        finalMsg = page.locator("xpath = //section[@role='tabpanel']/div/following-sibling::div[@class='qa-content section-three']");
        locationPopupCloseBtn = page.getByLabel("close icon");

    }

    public void customerCareSelection(){
        clickIfPresent(locationPopupCloseBtn);
        customerCareMenu.click();
    }

    public void topicAndIssueSelection(String topic){
        String topicSelectionXpath = String.format(topicSelectString, topic);
        page.locator(topicSelectionXpath).click();
        issueSelection.click();
        System.out.println(finalMsg.textContent());
    }

    public Locator getFinalMsg(){
        return finalMsg;
    }

}
