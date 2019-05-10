package softvisionProject.testcases.ApproachPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.PodsPage;
import softvisionProject.testcases.BaseTest;

public class PodsOurPodModelBtnTestCase extends BaseTest {
// Test Case:
// open approach/pods page from softvision.com and click on all of the button elements fromtitle "Our Pod Model".
//
    @Test
    public void frameworkBtn() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverApproachBtn();

        openMenuPage("Pods");
        PodsPage pods = new PodsPage(driver);
        pods.clickPodMitosis();
        pods.clickFramework();
        pods.clickGameOfPods();
        }
    }


