package softvisionProject.testcases.ContactPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.AustinStudioPage;
import softvisionProject.POM.ContactPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class openAustinStudio extends BaseTest {
// open contact/austinstudio from softvision.com.
//

    @Test
    public void openContactPage() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        openMenuPage("Contact");
        ContactPage contact = new ContactPage(driver);
        contact.austinStudio();
        AustinStudioPage austin = new AustinStudioPage(driver);
    }
}
