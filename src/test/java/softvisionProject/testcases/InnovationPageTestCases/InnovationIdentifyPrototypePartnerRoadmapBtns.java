package softvisionProject.testcases.InnovationPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InnovationPage;
import softvisionProject.testcases.BaseTest;

public class InnovationIdentifyPrototypePartnerRoadmapBtns extends BaseTest {
// Test Case:
// on softvision.com open innovation page and click on the tabs at the middle of the page: identify, prototype,
// partner and roadmap.
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();

        openMenuPage("Innovation");
        InnovationPage innovation = new InnovationPage(driver);
        innovation.identify();
        innovation.prototype();
        innovation.partner();
        innovation.roadmap();
    }
}
