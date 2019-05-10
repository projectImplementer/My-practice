package softvisionProject.testcases.ServicesPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.ServicesPage;
import softvisionProject.testcases.BaseTest;

public class openSoftVisionServicesPage extends BaseTest {
    //open services page from softvision.com
    //
    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        openMenuPage("Services");
        ServicesPage services = new ServicesPage(driver);
        urlAssert("services");
    }
}
