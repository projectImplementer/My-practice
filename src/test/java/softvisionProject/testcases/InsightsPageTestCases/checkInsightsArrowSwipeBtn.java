package softvisionProject.testcases.InsightsPageTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InsightsPage;
import softvisionProject.testcases.BaseTest;

public class checkInsightsArrowSwipeBtn extends BaseTest {
    //Open article "Vancouver Studio Design Team Retreat 2019" from Insights page
    // after selecting industry and guilds and check if the swipe arrow from the bottom of the page works.
    //
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        openMenuPage("Insights");
        InsightsPage insights = new InsightsPage(driver);
        urlAssert("insights");
        insights.clickIndustries("Agriculture");
        insights.clickGuilds("Design & UX");
        insights.clickShowMore();
        insights.removeOverlay();
        insights.articleDesignJam();
        openMenuPage("Insights");
        insights.openMatiBaldiArticle();
        insights.clickRightArrow();
        goToSoftVision();
        HomePage homeback = new HomePage(driver);
    }

}
