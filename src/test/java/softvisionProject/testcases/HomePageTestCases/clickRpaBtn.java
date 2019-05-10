package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.RPAPage;
import softvisionProject.testcases.BaseTest;

public class clickRpaBtn extends BaseTest {

    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.rpaBtn();
        RPAPage rpa = new RPAPage(driver);
    }
}
