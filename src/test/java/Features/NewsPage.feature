Feature: interact with NewsPage
  Open SoftVision.com and interact with the WebElements inside the NewsPage.

  Scenario: Open NewsPage
    When News on SoftVision and cookie accepted
    Then Open NewsPage

  Scenario: Click Community button
    When News on SoftVision and cookie accepted
    Then Open NewsPage
    And Click Community Button

  Scenario: Click Company News
    When News on SoftVision and cookie accepted
    Then Open NewsPage
    And Click Company News

  Scenario: Check Design Thinking
    When News on SoftVision and cookie accepted
    Then Open NewsPage
    And Check Design Thinking

  Scenario: Open Tehnical Agility Conference article
    When News on SoftVision and cookie accepted
    Then Open NewsPage
    And Open Tehnical Agility Conference article