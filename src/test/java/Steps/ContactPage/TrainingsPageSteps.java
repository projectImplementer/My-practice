package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.AlliancesPage;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.TrainingsPage;
import softvisionProject.testcases.BaseTest;

public class TrainingsPageSteps extends BaseTest {

    public HomePage home;
    public TrainingsPage training;

    private void initializeTrainingsPage() {
        if(training == null) {
            training = new TrainingsPage(driver);
        }
    }

    // Scenario I

    @When("^Trainings on SoftVision and cookie accepted$")
    public void contactOnSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();
    }

    @Then("^Open TrainingsPage$")
    public void openContactPage() {
        openMenuPage("Trainings");
        initializeTrainingsPage();
    }

    // Scenario II

    @And("^Verify elements: title, body, preEmp title, preEmp body, IndiaBtn$")
    public void verifyElements() {
        training.verifyTojTitle();
        training.verifyTojBody();
        training.verifyPreEmpTitle();
        training.verifyPreEmpBody();
        training.verifyIndiaBtn();
    }
}
