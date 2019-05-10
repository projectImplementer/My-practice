package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.PodsPage;
import softvisionProject.testcases.BaseTest;

public class PodsPageParagraphAndPngTestCase extends BaseTest {
// Test Case:
// open approach/pods page from softvision.com and check if first paragraph from "Innovation at Scale" title and Pod png
// are present on the webpage.
//
    @Test
    public void checkElements() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();

        openMenuPage("Pods");
        PodsPage pods = new PodsPage(driver);
        pods.checkInnovationFirstParagraph();
        pods.checkPodPng();
    }
}
