package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.AlliancesPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class AlliancesPageCheckBrandsTestCase extends BaseTest {
// Test Case:
// open approach/alliances page from softvision.com and check if brand elements(logo and title)
// acquia and adobe are present in the webpage.

    @Test
    public void brands () {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();

        openMenuPage("Alliances");
        AlliancesPage alliances = new AlliancesPage(driver);
        alliances.acquia();
        alliances.adobe();
    }

}
