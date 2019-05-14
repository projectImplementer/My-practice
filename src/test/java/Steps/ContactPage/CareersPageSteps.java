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
        home.hoverWorkWithUsBtn();
    }

    @Then("^Open CareersPage$")
    public void openContactPage() {
        openMenuPage("Careers");
        initializeCareersPage();
    }

    // Scenario II

    @And("^Select location/ expertise/ field/ click search button/ check title$")
    public void selectItems() {

        //career.clickLocation("Bangalore");
        career.selectLocations("to be removed later");
        career.clickExpertise("Agile Transformation Guild");
        career.searchField("marketing");
        career.searchButton();
        career.title();
    }
}
