Feature: Interact with InnovationPage
  Open SoftVision.com and interact with the WebElements inside the InnovationPage.

  Scenario: Open InnovationPage
    When Innovation on softvision and cookie accepted
    Then Open InnovationPage

  Scenario: Open Burst BlogPage
    When Innovation on softvision and cookie accepted
    Then Open InnovationPage
    And Open Burst BlogPage

  Scenario: Click on the following WebElements
    When Innovation on softvision and cookie accepted
    Then Open InnovationPage
    And Click Identify
    And Click Prototype
    And Click Partner
    And Click Roadmap


