package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class clickSolutionsTab extends BaseTest {

    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.solutionsPage();
    }
}
