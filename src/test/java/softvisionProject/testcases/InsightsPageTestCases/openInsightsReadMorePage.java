package softvisionProject.testcases.InsightsPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InsightsPage;
import softvisionProject.testcases.BaseTest;

public class openInsightsReadMorePage extends BaseTest {
    // Open insights page from softvision.com and click on ReadMore btn.
    //
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        titleAssert("Softvision, your Technology Partner for Digital Innovation");
        home.acceptCookieMethod();
        openMenuPage("Insights");
        InsightsPage insights = new InsightsPage(driver);
        urlAssert("insights");
        insights.clickReadMore();
    }
}
