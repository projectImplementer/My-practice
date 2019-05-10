package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.EcoSystemPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class EcoSystemselectAllElementsfromDeliver extends BaseTest {
    // Test Case:
// on approach/ecosystem page from softvision.com select every element from "How we deliver".
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();
        openMenuPage("Our Ecosystem");
        EcoSystemPage eco = new EcoSystemPage(driver);
        eco.removeBot();
        eco.guilds();
        eco.pods();
        eco.studios();
        eco.transform();
        eco.labs();
        eco.rightArrow();
        eco.alliances();
    }
}
