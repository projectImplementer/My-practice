Feature: Interact with PodsPage
  Open SoftVision.com and interact with the WebElements inside the PodsPage.

  Scenario: Open PodsPage
    When Pods on SoftVision and cookie accepted
    Then Open PodsPage

  Scenario: Interact with Pod Model Area
    When Pods on SoftVision and cookie accepted
    Then Open PodsPage
    And Click pod mitosis
    And Click framework
    And Click game of pods

  Scenario: Check Paragraph and PNG
    When Pods on SoftVision and cookie accepted
    Then Open PodsPage
    And Check paragraph
    And Check PNG