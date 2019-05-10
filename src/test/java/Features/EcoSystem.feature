Feature: Interact with EcoSystemPage
  Open SoftVision.com and interact with the WebElements inside the EcoSystemPage.

  Scenario: Open EcoSystemPage
    When EcoSystem on SoftVision and cookie accepted
    Then Open EcoSystemPage

  Scenario: Interact with the circle WebElements from EcoSystemPage
    When EcoSystem on SoftVision and cookie accepted
    Then Open EcoSystemPage
    And Interact with the elements