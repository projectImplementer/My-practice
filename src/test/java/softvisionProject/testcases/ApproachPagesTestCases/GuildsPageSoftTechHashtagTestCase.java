package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.GuildsPage;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.softwareTechnologyCategoryPage;
import softvisionProject.testcases.BaseTest;

public class GuildsPageSoftTechHashtagTestCase extends BaseTest {
// Test Case
// open the software&technology hashtag from the guilds page on softvision.com, hashtag related to article:
// Getting started with Xamarin.
//
    @Test
    public void software_technology() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();

        openMenuPage("Guilds");
        GuildsPage guilds = new GuildsPage(driver);
        softwareTechnologyCategoryPage soft = guilds.softTech();
    }
}
