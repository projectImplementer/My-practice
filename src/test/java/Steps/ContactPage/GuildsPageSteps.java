package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import softvisionProject.POM.GuildsPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class GuildsPageSteps extends BaseTest {

    public HomePage home;
    public GuildsPage guild;

    private void initializeGuildsPage() {
        if(guild == null) {
            guild = new GuildsPage(driver);
        }
    }

    // Scenario I

    @When("^Guilds on SoftVision and cookie accepted$")
    public void guildsAndCookie() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();
    }
    @And("^Open GuildsPage$")
    public void openGuildsPage() {
        openMenuPage("Guilds");
        initializeGuildsPage();
    }

    // Scenario II

    @And("^Click get in touch to find out more button$")
    public void clickGetInTouchButton() {
        guild.findOutMore();
        guild.closeOverlayForm();
    }

    // Scenario III

    @And("^Click ReadMore Button$")
    public void clickReadMoreButton() {
        guild.readMore();
    }

    // Scenario IV

    @And("^Click SoftTechTag$")
    public void clickSoftTech() {
        guild.softTech();
    }

    // Scenario V

    @And("^Click XamarinTag$")
    public void clickXamarinTag() {
        guild.xamarin();
    }

}
