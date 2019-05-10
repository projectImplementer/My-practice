Feature: Interact with AlliancesPage
  Open SoftVision.com and interact with the WebElements inside the AlliancesPage.

  Scenario: Open AlliancesPage
    When Alliances on SoftVision and cookie accepted
    Then Open AlliancesPage

  Scenario: Check Brands
    When Alliances on SoftVision and cookie accepted
    Then Open AlliancesPage
    And Check acquia brand
    And Check adobe brand

  Scenario: Check text
    When Alliances on SoftVision and cookie accepted
    Then Open AlliancesPage
    And Check specific text