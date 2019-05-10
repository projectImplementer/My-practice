package softvisionProject.testcases.WorkWithUsPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.CareersPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class openCareersPage extends BaseTest {

    @Test
    public void searchFields() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverWorkWithUsBtn();
        openMenuPage("Careers");
        CareersPage careers = new CareersPage(driver);
    }

}