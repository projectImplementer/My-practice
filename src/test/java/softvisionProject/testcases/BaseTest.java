package softvisionProject.testcases;

import com.beust.jcommander.Parameter;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.String;

import static softvisionProject.framework.helperClass.chooseBrowser;

public class BaseTest {


    public static WebDriver driver;

    public BaseTest() {}
    public BaseTest(WebDriver driver) {
    this.driver = driver;
}

    // JS Executor
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //


    // Methods
    public void goToSoftVision() {
        driver.navigate().to("https://softvision.com");
    }

    // open any page
    public void openMenuPage(String pageName) {
            String desiredPage = "//span[text()='" + pageName + "']";
            WebElement menuPage = driver.findElement(By.xpath(desiredPage));
            menuPage.click();

    }

    public void openSecondaryPage(String subPageName) {
        String desiredPage = "//span[text()='" + subPageName + "']";
        WebElement subPage = driver.findElement(By.xpath(desiredPage));
        subPage.click();
    }
    // assertions url and title.
    public void urlAssert(String pageName) {
            String expectedPageUrl = "https://www.softvision.com/" + pageName + "/";
            Assert.assertEquals(driver.getCurrentUrl(), expectedPageUrl);
            System.out.println("- " + pageName + " url: pass");

    }

   /* public void mainPageAssert() {
        String expectedMainUrl = "https://www.softvision.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedMainUrl);
        System.out.println("Main assert done");
    } */

    public void titleAssert(String titleName) {
        String expectedTitle =  titleName;
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        System.out.println("- title: pass");
    }
    //


    @Parameters({"browserName"})
    @BeforeClass
    public void initializeBrowser(String browserName) {
        driver = chooseBrowser(browserName);
    }


    @AfterClass
    public void e_stop() {
        driver.quit();
    }

}



