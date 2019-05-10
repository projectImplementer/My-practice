Feature: Interact with InsightsPage
  Open SoftVision.com and interact with the WebElements inside the InsightsPage.

  Scenario: Open InsightsPage
    When on SoftVision and cookie accepted
    Then Open InsightsPage

  Scenario: Interact with the swipe arrow inside MatiBaldiArticle
    When on SoftVision and cookie accepted
    Then Open InsightsPage
    And Select Industries
    And Select Guilds
    And Click ShowMore
    And Remove Overlay
    Then Open DesignJam article
    And Return to InsightsPage
    Then Open MatiBaldi article
    And Interact with swipe right arrow

  Scenario: Interact with ReadMore button
    When on SoftVision and cookie accepted
    Then Open InsightsPage
    And Click on ReadMore button