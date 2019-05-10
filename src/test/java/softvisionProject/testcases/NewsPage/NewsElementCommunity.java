package softvisionProject.testcases.NewsPage;

import org.testng.annotations.Test;
import softvisionProject.POM.communityCategoryPage;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.NewsPage;
import softvisionProject.testcases.BaseTest;

public class NewsElementCommunity extends BaseTest {
// Test Case:
// open news page from softvision.com and click on the community hashtag from the article:
// Softvisioners Participate in Lviv Half Marathon.
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        openMenuPage("News");
        NewsPage news = new NewsPage(driver);
        news.clickCommunityBtn();
        communityCategoryPage unity = new communityCategoryPage(driver);
    }

}
