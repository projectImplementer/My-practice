package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class personaltaskmuteUnmuteSound extends BaseTest {

    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage homeAssert = new HomePage(driver);
        homeAssert.acceptCookieMethod();
    }

    @Test (priority = 2)
    public void muteUnmuteSound() {
        HomePage sound = new HomePage(driver);
        sound.muteUnmuteSound();
        sound.muteUnmuteSound();
    }
}
