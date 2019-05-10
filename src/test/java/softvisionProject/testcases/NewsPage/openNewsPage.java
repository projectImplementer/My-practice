package softvisionProject.testcases.NewsPage;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.NewsPage;
import softvisionProject.testcases.BaseTest;

public class openNewsPage extends BaseTest {
// Test Case:
// open news page on softvision.com
//
    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();

        openMenuPage("News");
        NewsPage news = new NewsPage(driver);
        }
    }

