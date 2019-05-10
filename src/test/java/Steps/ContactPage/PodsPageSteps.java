package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.PodsPage;
import softvisionProject.testcases.BaseTest;

public class PodsPageSteps extends BaseTest {

    public HomePage home;
    public PodsPage pod;

    private void initializePodsPage() {
        if(pod == null) {
            pod = new PodsPage(driver);
        }
    }

    // Scenario I

    @When("^Pods on SoftVision and cookie accepted$")
    public void podsOnSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();
    }

    @Then("^Open PodsPage$")
    public void openPodsPage() {
        openMenuPage("Pods");
    }

    // Scenario II

    @And("^Click pod mitosis$")
    public void clickPodMitosis() {
        initializePodsPage();
        pod.clickPodMitosis();
    }

    @And("^Click framework$")
    public void clickFramework() {
        initializePodsPage();
        pod.clickFramework();
    }

    @And("^Click game of pods$")
    public void clickGameOfPods() {
        initializePodsPage();
        pod.clickGameOfPods();
    }

    // Scenario III

    @And("^Check paragraph$")
    public void checkParagraphs() {
        initializePodsPage();
        pod.checkInnovationFirstParagraph();
    }

    @And("^Check PNG$")
    public void checkPNG() {
        initializePodsPage();
        pod.checkPodPng();
    }
}

