package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.NewsPage;
import softvisionProject.testcases.BaseTest;

public class NewsPageSteps extends BaseTest {

    public HomePage home;
    public NewsPage news;

    private void initializeNewsPage() {
        if (news == null) {
            news = new NewsPage(driver);
        }
    }

    // Scenario I

    @When("^News on SoftVision and cookie accepted$")
    public void newsOnSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
    }

    @Then("^Open NewsPage$")
    public void openNewsPage() {
        openMenuPage("News");
    }

    // Scenario II

    @And("^Click Community Button$")
    public void clickCommunityButton() {
        initializeNewsPage();
        news.clickCommunityBtn();
    }

    // Scenario III

    @And("^Click Company News$")
    public void clickCompanyNews() {
        initializeNewsPage();
        news.clickCompanyNewsBtn();
    }

    // Scenario IV

    @And("^Check Design Thinking$")
    public void checkDesignThinking() {
        initializeNewsPage();
        news.designThinking();
    }

    // Scenario V

    @And("^Open Tehnical Agility Conference article$")
    public void openTehnicalAgilityCOnferenceArticle() {
        initializeNewsPage();
        news.eventsTab();
        news.eventsTabArticle1();
    }
}
