package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.CareersPage;
import softvisionProject.POM.ContactPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class CareersPageSteps extends BaseTest {

    public HomePage home;
    public CareersPage career;

    private void initializeCareersPage() {
        if(career == null) {
            career = new CareersPage(driver);
        }
    }


    // Scenario I

    @When("^Careers on SoftVision and cookie accepted$")
    public void contactOnSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
    }

    @Then("^Open CareersPage$")
    public void openContactPage() {
        openMenuPage("Careers");
    }

    // Scenario II

    @And("^Select location/ expertise/ field/ click search button/ check title$")
    public void selectItems() {
        initializeCareersPage();
        career.clickLocation("Bangalore");
        career.clickExpertise("Agile Transformation Guild");
        career.searchField("marketing");
        career.searchButton();
        career.title();

    }
}
