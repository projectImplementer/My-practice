package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.AlliancesPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class AlliancesPageCheckInParagraphTextTestCase extends BaseTest {
// Test Case:
// open approach/alliances page from softvision.com and check if the "Better Together" paragraph contains the text:
// "The goals of our Alliance program".

    @Test
    public void paragraphCheck() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();

        openMenuPage("Alliances");
        AlliancesPage alliances = new AlliancesPage(driver);
        alliances.text();
    }
}
