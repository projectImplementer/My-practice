package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.ContactPage;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.ServicesPage;
import softvisionProject.testcases.BaseTest;

public class ServicesPageSteps extends BaseTest {

    public HomePage home;
    public ServicesPage service;

    private void initializeServicesPage() {
        if(service == null) {
            service = new ServicesPage(driver);
        }
    }


    // Scenario I

    @When("^Services: SoftVision and cookie accepted$")
    public void onSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
    }
    @Then("^Open ServicesPage$")
    public void openServicesPage() {
        openMenuPage("Services");
    }

    // Scenario II

    @And("^Click Define User Journeys WebElement$")
    public void clickDefineUserJourneysWebElement() {
        initializeServicesPage();
        service.defineUserJourneys();
    }

    @And("^Click Play on YT video$")
    public void clickPlayOnYTVideo() {
        initializeServicesPage();
        service.playWeArePeopleVideo();
    }

    @And("^Check list item presence$")
    public void checkListItemPresence() {
        initializeServicesPage();
        service.listItem();
    }

}
