package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.blogGettingStartedWithXamarinPage;
import softvisionProject.POM.GuildsPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class GuildsPageReadMoreBtnTestCase extends BaseTest {
// Test Case
// open approach/guilds page from softvision.com and click on Read More Button from the bottom of the page.
//
    @Test
    public void clickReadMore() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();

        openMenuPage("Guilds");
        GuildsPage guilds = new GuildsPage(driver);
        guilds.readMore();
        blogGettingStartedWithXamarinPage xamarinBlog = new blogGettingStartedWithXamarinPage(driver);
    }

}
