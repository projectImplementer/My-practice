package softvisionProject.testcases.InnovationPageTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.InnovationPage;
import softvisionProject.POM.blogSystematicallyInnovateorBurst;
import softvisionProject.testcases.BaseTest;

public class InnovationArticleInnovation extends BaseTest {
// Test Case:
// on softvision.com open innovation page and click on the article Systematically innovate or bust
//
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();

        openMenuPage("Innovation");
        InnovationPage innovation = new InnovationPage(driver);
        innovation.innovateBurst();
        blogSystematicallyInnovateorBurst blog = new blogSystematicallyInnovateorBurst(driver);

    }
}