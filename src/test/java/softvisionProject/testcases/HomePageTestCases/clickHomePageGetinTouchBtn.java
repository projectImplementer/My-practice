package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.WindowsServerPage;
import softvisionProject.testcases.BaseTest;

public class clickHomePageGetinTouchBtn extends BaseTest {

        @Test
    public void openSoftVision() {
            goToSoftVision();
            HomePage home = new HomePage(driver);
            home.acceptCookieMethod();
            home.getInTouchBtn();
            WindowsServerPage win = new WindowsServerPage(driver);
        }
}
