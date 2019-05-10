Feature: Interact with ServicesPage
  Open SoftVision.com and interact with the WebElements inside the ServicesPage.

  Scenario: Open ServicesPage
    When Services: SoftVision and cookie accepted
    Then Open ServicesPage

  Scenario: Open Product Design Page
    When Services: SoftVision and cookie accepted
    Then Open ServicesPage
    And Click Define User Journeys WebElement

  Scenario: Play we are the people video
    When Services: SoftVision and cookie accepted
    Then Open ServicesPage
    And Click Play on YT video

  Scenario: Check shift to microservices list item presence
    When Services: SoftVision and cookie accepted
    Then Open ServicesPage
    And Check list item presence

