 package softvisionProject.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


import java.lang.String;

import org.testng.Assert;
import org.testng.annotations.*;


import static softvisionProject.framework.helperClass.runChromeDriver;



public class contPage {
    // // use runDriver from helperClass GLOBALLY
    public WebDriver driver;

    @BeforeSuite
    public void a_print() {
        System.out.println("It works so far");
        driver = runChromeDriver();
    }

    @Test
    public void b_openUrl() {
// open SoftVision and assert
        driver.navigate().to("https://softvision.com");

// Assert proper 'Home' page has been opened
        String expectedHomeUrl = "https://www.softvision.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedHomeUrl);
        System.out.println("Assertion successful: Current Home Url = Expected Home Url");
    }
    @Test
    public void c_cookie() {
// accept Cookie
        String iD = "hs-eu-confirmation-button";
        driver.findElement(By.id(iD)).click();
    }

    @Test
    public void d_openContactUrl() {
// find 'Contact' and click WebElement
        String xpath = "//span[text()='Contact']";
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();

//  Assert 'Tab Title' after opening 'Contact' page
        String expectedTitle = "Softvision - Contact";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        System.out.println("Assertion successful: Current Title = Expected Title");

//  Assert proper 'Contact' page has been opened
        String expectedContactUrl = "https://www.softvision.com/contact/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedContactUrl);
        System.out.println("Assertion successful: Current Contact Url = Expected Url");
    }

    @AfterSuite
    public void e_close() {
        driver.close();
        driver.quit();

    }
}
*/
