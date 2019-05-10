package softvisionProject.testcases.HomePageTestCases;

import softvisionProject.POM.BasePage;
import softvisionProject.POM.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import softvisionProject.testcases.BaseTest;

import static softvisionProject.framework.helperClass.chooseBrowser;


public class openSoftVisionHP extends BaseTest {
    //open home page from softvision.com
    //
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        titleAssert("Softvision, your Technology Partner for Digital Innovation");


    }

}

