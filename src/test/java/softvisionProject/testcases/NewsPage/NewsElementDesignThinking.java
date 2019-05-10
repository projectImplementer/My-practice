package softvisionProject.testcases.NewsPage;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.NewsPage;
import softvisionProject.POM.designThinkingCategoryPage;
import softvisionProject.testcases.BaseTest;

public class NewsElementDesignThinking extends BaseTest {
// Test Case:
// open news page on softvision.com and click on the hashtag: "Design Thinking" from the article:
// Cognizant Softvision Holds Design Thinking Workshops.
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();

        openMenuPage("News");
        NewsPage news = new NewsPage(driver);
        news.designThinking();
        designThinkingCategoryPage design = new designThinkingCategoryPage(driver);
    }
}
