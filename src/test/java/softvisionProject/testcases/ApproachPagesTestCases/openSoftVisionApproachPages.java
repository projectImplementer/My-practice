package softvisionProject.testcases.ApproachPagesTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import softvisionProject.POM.*;
import softvisionProject.framework.helperClass;
import softvisionProject.testcases.BaseTest;

import static softvisionProject.framework.helperClass.chooseBrowser;


public class openSoftVisionApproachPages extends BaseTest {
    //open all of the approach pages on softvision.com
    //
    @Test (priority = 1)
    public void openHomePage() {
        goToSoftVision();
        HomePage homeAssert = new HomePage(driver);
        homeAssert.acceptCookieMethod();

        openMenuPage("Contact");
        ContactPage contactAssert = new ContactPage(driver);
        contactAssert.hoverApproachBtn();
    }

    @Test (priority = 2)
    public void openEcoSystemPage() {
        openMenuPage("Our Ecosystem");
        EcoSystemPage systemAssert = new EcoSystemPage(driver);
        systemAssert.hoverApproachBtn();
    }

    @Test (priority = 3)
    public void openGuildsPage() {
        openMenuPage("Guilds");
        GuildsPage guildsAssert = new GuildsPage(driver);
        guildsAssert.hoverApproachBtn();
    }

    @Test (priority = 4)
    public void openPodsPage() {
        openMenuPage("Pods");
        PodsPage podsAssert = new PodsPage(driver);
        podsAssert.hoverApproachBtn();
    }

    @Test (priority = 5)
    public void openAlliancesPage() {
        openMenuPage("Alliances");
        AlliancesPage alliancesAssert = new AlliancesPage(driver);
    }
}

