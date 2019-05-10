package softvisionProject.testcases.HomePageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class personaltaskclickSliderLeftandRightArrow extends BaseTest {

    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage homeAssert = new HomePage(driver);
        homeAssert.acceptCookieMethod();
    }

    @Test (priority = 2)
    public void clickSliderArrows() {
        HomePage useArrow = new HomePage(driver);
        useArrow.sliderLeftArrow();
        useArrow.sliderRightArrow();
    }
}
