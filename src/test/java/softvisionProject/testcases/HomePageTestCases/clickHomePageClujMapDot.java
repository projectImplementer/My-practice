package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.ClujNapocaStudioPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class clickHomePageClujMapDot extends BaseTest {

    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.mapDotCluj();
        home.inDotViewStudioBtn();
        ClujNapocaStudioPage cluj = new ClujNapocaStudioPage(driver);
    }
}
