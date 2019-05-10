package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class personaltaskpausePlayVideo extends BaseTest {
    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.pausePlayVideo();

    }
}
