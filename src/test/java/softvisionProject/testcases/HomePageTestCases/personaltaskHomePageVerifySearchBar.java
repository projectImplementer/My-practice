package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class personaltaskHomePageVerifySearchBar extends BaseTest {

    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.searchBtn();
        home.allDropDownList("News");
        home.searchBar("retreat");
    }
}
