package com.automation.Steps;

import com.automation.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        homePage.openWebsite();
    }
    @Given("user navigates to the bottom of the page")
    public void user_navigates_to_the_bottom_of_the_page() {
        homePage.goingUpAndDown();

    }
    @When("user clicks on the goto top arrow button")
    public void user_clicks_on_the_goto_top_arrow_button() {

        homePage.clickArrowBtn();

    }
    @Then("user must reach the top of the page")
    public void user_must_reach_the_top_of_the_page() {

        assertThat(homePage.getAjioLogo()).isVisible();
    }


}
