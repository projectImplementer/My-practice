package softvisionProject.testcases.InnovationPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InnovationPage;
import softvisionProject.testcases.BaseTest;

public class OpenInnovationPage extends BaseTest {
// Test Case:
// open innovation page on softvision.com
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();

        openMenuPage("Innovation");
        InnovationPage innovation = new InnovationPage(driver);
    }
}
