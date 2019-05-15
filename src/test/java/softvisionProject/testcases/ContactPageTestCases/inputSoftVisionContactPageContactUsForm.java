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



public class inputSoftVisionContactPageContactUsForm extends BaseTest {
    // open softvision.com contact page and manipulate the contact form.
    //
    @Test
    public void openSoftVision() {
        goToSoftVision();
        HomePage homeAssert = new HomePage(driver);
        titleAssert("Softvision, your Technology Partner for Digital Innovation");
        homeAssert.acceptCookieMethod();
        openMenuPage("Contact");
        ContactPage contactUsForm = new ContactPage(driver);
        urlAssert("contact");
        contactUsForm.InputNamePlease("Bogdan");
        contactUsForm.InputEmailPlease("at@at.com");
        //contactUsForm.OpenDropDownList("Press");
        contactUsForm.clickRegardingList("Press");
        contactUsForm.InputMessagePlease("Please check my request");
        /* DropDownList choices:
        General
        Work With Us
        Business
        Press
        Microsoft
         */
    }

}
