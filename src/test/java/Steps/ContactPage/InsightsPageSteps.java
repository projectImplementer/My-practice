package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InsightsPage;
import softvisionProject.testcases.BaseTest;

public class InsightsPageSteps extends BaseTest {

    public HomePage home;
    public InsightsPage insight;

    private void initializeInsightsPage() {
        this.insight = new InsightsPage(driver);
    }

    // Scenario I

    @When("^on SoftVision and cookie accepted$")
    public void onSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
    }

    @Then("^Open InsightsPage$")
    public void openInsightsPage() {
        openMenuPage("Insights");
        initializeInsightsPage();
    }

    // Scenario II

    @And("^Select Industries$")
    public void selectIndustries() {
        insight.clickIndustries("Agriculture");
    }
    @And("^Select Guilds$")
    public void selectGuilds() {
        insight.clickGuilds("Design & UX");
    }
    @And("^Click ShowMore$")
    public void clickShowMore() {
        insight.clickShowMore();
    }
    @And("^Remove Overlay$")
    public void removeOverlay() {
        insight.removeOverlay();
    }
    @Then("^Open DesignJam article$")
    public void designJamArticle() {
        insight.articleDesignJam();
    }
    @And("^Return to InsightsPage$")
    public void returnToInsightsPage() {
        openMenuPage("Insights");
        initializeInsightsPage();
    }
    @Then("^Open MatiBaldi article$")
    public void openMatiBaldiarticle() {
        insight.openMatiBaldiArticle();
    }
    @And("^Interact with swipe right arrow$")
    public void interactWithSwipeRightArrow() {
        insight.clickRightArrow();
    }

    // Scenario III
    @And("^Click on ReadMore button$")
    public void clickOnReadMoreButton() {
        insight.clickReadMore();
    }
}
