package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InnovationPage;
import softvisionProject.POM.ServicesPage;
import softvisionProject.testcases.BaseTest;

public class InnovationPageSteps extends BaseTest {

    public HomePage home;
    public InnovationPage innovate;
    private void initializeInnovationPage() {
        if(innovate == null) {
            innovate = new InnovationPage(driver);
        }
    }

    // Scenario I

    @When("^Innovation on softvision and cookie accepted$")
    public void acceptCookie() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
    }

    @Then("^Open InnovationPage$")
    public void openInnovation() {
        openMenuPage("Innovation");
        initializeInnovationPage();
    }

    // Scenario II

    @And("^Open Burst BlogPage$")
    public void openBurstBlogPage() {
        innovate.innovateBurst();
    }


    // Scenario III

    @And("^Click Identify$")
    public void clickIdentify() {
        innovate.identify();
    }

    @And("^Click Prototype$")
    public void clickPrototype() {
        innovate.prototype();
    }

    @And("^Click Partner$")
    public void clickPartner() {
        innovate.partner();
    }

    @And("^Click Roadmap$")
    public void clickRoadmap() {
        innovate.roadmap();
    }


}
