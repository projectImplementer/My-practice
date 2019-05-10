package softvisionProject.testcases.WorkWithUsPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.CareersPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class CareersPageFieldsTestCase extends BaseTest {
// Test Case:
// open work with us/careers from softvision.com and input data into the three fields. After input is done click search.
// At the end of the test case verify if the title "Find your next challenge" is visible.
    @Test
    public void searchFields() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverWorkWithUsBtn();
        openMenuPage("Careers");
        CareersPage careers = new CareersPage(driver);
        careers.clickLocation("Bangalore");
        careers.clickExpertise("Agile Transformation Guild");
        careers.searchField("marketing");
        careers.searchButton();
        careers.title();
    }
}
