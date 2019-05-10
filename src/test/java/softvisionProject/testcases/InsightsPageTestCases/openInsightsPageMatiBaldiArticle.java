package softvisionProject.testcases.InsightsPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InsightsPage;
import softvisionProject.testcases.BaseTest;

public class openInsightsPageMatiBaldiArticle extends BaseTest {

    @Test(priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        openMenuPage("Insights");
        InsightsPage insights = new InsightsPage(driver);
        insights.removeOverlay();
        insights.openMatiBaldiArticle();
    }
}
