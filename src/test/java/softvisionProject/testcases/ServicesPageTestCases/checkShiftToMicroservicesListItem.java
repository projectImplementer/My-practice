package softvisionProject.testcases.ServicesPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.ServicesPage;
import softvisionProject.testcases.BaseTest;

public class checkShiftToMicroservicesListItem extends BaseTest {

    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        openMenuPage("Services");
        ServicesPage services = new ServicesPage(driver);
        services.listItem();
    }

}
