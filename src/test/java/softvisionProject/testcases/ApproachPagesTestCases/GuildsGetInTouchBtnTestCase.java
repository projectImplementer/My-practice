package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.GuildsPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class GuildsGetInTouchBtnTestCase extends BaseTest {
// Test Case
// open approach/guilds from softvision.com and click on the button from bottom page:
// "GET IN TOUCH TO FIND OUT MORE".
    @Test
    public void getInTouchBtn() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();

        openMenuPage("Guilds");
        GuildsPage guilds = new GuildsPage(driver);
        guilds.findOutMore();
        guilds.closeOverlayForm();
    }

}
