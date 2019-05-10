package softvisionProject.testcases.InsightsPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InsightsPage;
import softvisionProject.testcases.BaseTest;

public class openInsightsPage extends BaseTest {
    //open insights page from softvision.com.

    @Test (priority = 1)
    public void openReadMore() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
    }
    /*
        openDesiredPage("Insights");
        InsightsPage insightsAssert = new InsightsPage(driver);
        urlAssert("insights");

        insightsAssert.clickReadMore();
        driver.navigate().back();
        insightsAssert.clickIndustries("Agriculture");
        insightsAssert.clickGuilds("Design & UX");
        insightsAssert.clickShowMore();
        insightsAssert.clickVancouver2019Studio();
        insightsAssert.closePopUp();
        insightsAssert.clickRightArrow();
    }
*/
}
