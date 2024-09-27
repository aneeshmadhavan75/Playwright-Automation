package com.automation.Steps;

import com.automation.Pages.CustomerCarePage;
import com.automation.Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CustomerCareSteps {

    CustomerCarePage customerCarePage = new CustomerCarePage();

    @Then("user clicks on customer care option")
    public void user_clicks_on_customer_care_option() {

        customerCarePage.customerCareSelection();

    }
    @When("user select topic {string} and issue")
    public void user_select_topic_and_issue(String topic) {

        customerCarePage.topicAndIssueSelection(ConfigReader.getConfigValue(topic));

    }
    @Then("verify message is displayed in the get assistance section")
    public void verify_message_is_displayed_in_the_get_assistance_section() {

        assertThat(customerCarePage.getFinalMsg()).isVisible();

    }

}
