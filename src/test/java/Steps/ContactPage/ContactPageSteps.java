package Steps.ContactPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import softvisionProject.POM.ContactPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class ContactPageSteps extends BaseTest {

    public HomePage home;
    public ContactPage contact;

    private void initializeContactPage() {
        if(contact == null) {
            contact = new ContactPage(driver);
        }
    }


    // Scenario I

    @When("^Contact on SoftVision and cookie accepted$")
    public void contactOnSoftVisionAndCookieAccepted() {
        home = new HomePage(driver);
        home.acceptCookieMethod();
    }

    @Then("^Open ContactPage$")
    public void openContactPage() {
        openMenuPage("Contact");
    }

    // Scenario II

    @And("^Interact with ContactForm$")
    public void interactWithContactForm() {
        initializeContactPage();
        contact.InputNameCucumber();
        contact.InputEmailCucumber();
        contact.OpenDropDownList("Press");
        contact.InputMessagePlease("Please check my request");
    }

    // Scenario III

    @And("^Open AustinStudio$")
    public void openAustinStudio() {
        initializeContactPage();
        contact.austinStudio();
    }
}
