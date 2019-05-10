package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.ClujNapocaStudioPage;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.RPAPage;
import softvisionProject.testcases.BaseTest;

public class HomePageSteps extends BaseTest {
    public HomePage home;

     public HomePageSteps() {
        this.home = new HomePage(driver);
    }

    // Use constructor from above or use method from below

   /*  private void initializeHomePage() {
        if(home == null) {
            home = new HomePage(driver);
        }
    }
    */


    @When("^On SoftVision site$")
    public void onSoftVisionSite() {
        home.acceptCookieMethod();
    }
    @Then("^Click Solutions Tab$")
    public void clickSolutionsTab() {
        home.solutionsPage();
    }
    @Then("^Click RPA hashtag button$")
    public void clickRPAHashtagButton() {
        home.rpaBtn();
        RPAPage rpa = new RPAPage(driver);
    }
    @Then("^Click get in touch button$")
    public void clickGetInTouchBtn() {
        home.getInTouchBtn();
    }
    @Then("^Open Cluj dot$")
    public void openClujDot() {
        home.mapDotCluj();
    }
    @And("^Click View Studio button$")
    public void clickViewStudioButton() {
        home.inDotViewStudioBtn();
        ClujNapocaStudioPage cluj = new ClujNapocaStudioPage(driver);

    }
}

