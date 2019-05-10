package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.EcoSystemPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class EcoSystemfindText extends BaseTest {
// Test Case:
// on approach/ecosystem page from softvision.com check if "The Softvision model is proven" is present.
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();
        openMenuPage("Our Ecosystem");
        EcoSystemPage eco = new EcoSystemPage(driver);



    }
}
