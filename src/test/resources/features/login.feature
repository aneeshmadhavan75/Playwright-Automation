Feature: Ecommerce functionality verification
  Scenario: verify the goto the top button is working
    Given user opens the website
    And user navigates to the bottom of the page
    When user clicks on the goto top arrow button
    Then user must reach the top of the page

  Scenario: verify customer care message is displayed properly
    Given user opens the website
    Then user clicks on customer care option
    When user select topic "Topic" and issue
    Then verify message is displayed in the get assistance section