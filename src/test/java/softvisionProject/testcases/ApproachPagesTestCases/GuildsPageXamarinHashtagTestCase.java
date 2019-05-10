package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.GuildsPage;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.xamarinCategoryPage;
import softvisionProject.testcases.BaseTest;

public class GuildsPageXamarinHashtagTestCase extends BaseTest {
// Test Case:
// open approach/guilds page from softvision.com and click on "Xamarin" hashtag from article:
//"Getting started with Xamarin".
    @Test
    public void xamarin() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();
        openMenuPage("Guilds");
        GuildsPage guilds = new GuildsPage(driver);
        guilds.xamarin();
        xamarinCategoryPage xamarin = new xamarinCategoryPage(driver);
    }
}
