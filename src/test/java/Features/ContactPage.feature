Feature: Interact with ContactPage
  Open SoftVision.com and interact with the WebElements inside the ContactPage.

  Scenario: Open ContactPage
    When Contact on SoftVision and cookie accepted
    Then Open ContactPage

  Scenario: Input data into ContactForm
    When Contact on SoftVision and cookie accepted
    Then Open ContactPage
    And Interact with ContactForm

  Scenario: Open AustinStudio
    When Contact on SoftVision and cookie accepted
    Then Open ContactPage
    And Open AustinStudio