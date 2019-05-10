package softvisionProject.testcases.NewsPage;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.NewsPage;
import softvisionProject.POM.articleTechnicalagilityconference2019;
import softvisionProject.testcases.BaseTest;

public class NewsTabEventsOpenArticle extends BaseTest {
// Test Case:
// on news page from softvision.com click on the events tab and then click on the article:
// Tehnical Agility Conference 2019.
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();

        openMenuPage("News");
        NewsPage news = new NewsPage(driver);
        news.eventsTab();
        news.eventsTabArticle1();
        articleTechnicalagilityconference2019 tab = new articleTechnicalagilityconference2019(driver);
    }
}
