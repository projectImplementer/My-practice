package softvisionProject.testcases.ContactPageTestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


import java.lang.String;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import softvisionProject.POM.BasePage;
import softvisionProject.POM.ContactPage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;


import static softvisionProject.framework.helperClass.chooseBrowser;



public class openSoftVisionContactPage extends BaseTest {
    //open contact page from softvision.com
    //

    @Test

    public void openSoftVision() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        titleAssert("Softvision, your Technology Partner for Digital Innovation");
        home.acceptCookieMethod();

        openMenuPage("Contact");
        ContactPage contactAssert = new ContactPage(driver);
        urlAssert("contact");
    }
}
