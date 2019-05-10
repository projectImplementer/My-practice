package softvisionProject.testcases.InsightsPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InsightsPage;
import softvisionProject.testcases.BaseTest;

public class checkInsightsPageShowMoreBtn extends BaseTest {
    // Open softvision.com and check if ShowMore button will return more elements. If yes, return to homepage.
    //
    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        titleAssert("Softvision, your Technology Partner for Digital Innovation");
        home.acceptCookieMethod();
        openMenuPage("Insights");
        InsightsPage insights = new InsightsPage(driver);
        urlAssert("insights");
        insights.clickShowMore();
        goToSoftVision();
        HomePage homeback = new HomePage(driver);
    }
}
