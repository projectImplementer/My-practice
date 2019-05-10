package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.AlliancesPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class AlliancesPageSteps extends BaseTest {

    public HomePage home;
    public AlliancesPage alliance;

    private void initializeAlliancesPage() {
        if(alliance == null) {
            alliance = new AlliancesPage(driver);
        }
    }

    // Scenario I

    @When("^Alliances on SoftVision and cookie accepted$")
    public void contactOnSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
    }

    @Then("^Open AlliancesPage$")
    public void openContactPage() {
        openMenuPage("Contact");
    }

    // Scenario II

    @And("^Check acquia brand$")
    public void checkAcquiaBrand() {
        initializeAlliancesPage();
        alliance.acquia();
    }

    @And("^Check adobe brand$")
    public void checkAdobeBrand() {
        initializeAlliancesPage();
        alliance.acquia();
    }

    // Scenario III

    @And("^Check specific text$")
    public void checkSpecificText() {
        initializeAlliancesPage();
        alliance.text();
    }
}
