package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.EcoSystemPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class EcoSystemPageSteps extends BaseTest {

    public HomePage home;
    public EcoSystemPage eco;

    private void initializeEcoSystemPage() {
        if(eco == null) {
            eco = new EcoSystemPage(driver);
        }
    }

    // Scenario I

    @When("^EcoSystem on SoftVision and cookie accepted$")
    public void acceptCookieAndHoverMouse() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();
    }

    @Then("^Open EcoSystemPage$")
    public void openPage() {
        openMenuPage("Our Ecosystem");
    }

    // Scenario II

    @And("^Interact with the elements$")
    public void interactElements() {
        initializeEcoSystemPage();
        eco.removeBot();
        eco.guilds();
        eco.pods();
        eco.studios();
        eco.transform();
        eco.labs();
        eco.rightArrow();
        eco.alliances();
    }
}
