Feature: Interact with TrainingsPage
  Open SoftVision.com and interact with the WebElements inside the TrainingsPage.

  Scenario: Open TrainingsPage
    When Trainings on SoftVision and cookie accepted
    Then Open TrainingsPage

  Scenario: Open CareersPage
    When Trainings on SoftVision and cookie accepted
    Then Open TrainingsPage
    And Verify elements: title, body, preEmp title, preEmp body, IndiaBtn