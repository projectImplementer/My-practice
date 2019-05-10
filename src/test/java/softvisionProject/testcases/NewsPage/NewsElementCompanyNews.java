package softvisionProject.testcases.NewsPage;

import org.testng.annotations.Test;
import softvisionProject.POM.companyNewsCategoryPage;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.NewsPage;
import softvisionProject.testcases.BaseTest;

public class NewsElementCompanyNews extends BaseTest {
// Test Case:
// on news page from softvision.com click the company news hashtag from the second article:
// Top Drupal Developers Attend DrupalCon Seattle.
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();

        openMenuPage("News");
        NewsPage news = new NewsPage(driver);
        news.clickCompanyNewsBtn();
        companyNewsCategoryPage company = new companyNewsCategoryPage(driver);
    }
}
