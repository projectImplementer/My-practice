Feature: Interact with GuildsPage
  Open SoftVision.com and interact with the WebElements inside the GuildsPage.

  Scenario:
    When Guilds on SoftVision and cookie accepted
    Then Open GuildsPage

  Scenario: Click get in touch button
    When Guilds on SoftVision and cookie accepted
    Then Open GuildsPage
    And Click get in touch to find out more button

  Scenario: Click ReadMore button
    When Guilds on SoftVision and cookie accepted
    Then Open GuildsPage
    And Click ReadMore Button

  Scenario: Click SoftTech HashTag
    When Guilds on SoftVision and cookie accepted
    Then Open GuildsPage
    And Click SoftTechTag

  Scenario: Click Xamarin Tag
    When Guilds on SoftVision and cookie accepted
    Then Open GuildsPage
    And Click XamarinTag

