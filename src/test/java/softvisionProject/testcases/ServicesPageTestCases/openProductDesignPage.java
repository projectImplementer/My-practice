package softvisionProject.testcases.ServicesPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.productDesignPage;
import softvisionProject.POM.ServicesPage;
import softvisionProject.testcases.BaseTest;

public class openProductDesignPage extends BaseTest {

    @Test
    public void clickDeJ() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        openMenuPage("Services");
        ServicesPage services = new ServicesPage(driver);
        services.defineUserJourneys();
        productDesignPage product = new productDesignPage(driver);
    }
}
