package softvisionProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.lang.String;

import org.testng.Assert;


import static softvisionProject.framework.helperClass.runChromeDriver;



public class openSV {


    public static void main(String[] args) {

// use runDriver from helperClass
        WebDriver driver = runChromeDriver();

// open SoftVision
        driver.navigate().to("https://softvision.com");

// Assert proper 'Home' page has been opened
        String expectedHomeUrl = "https://www.softvision.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedHomeUrl);
        System.out.println("Assertion successful: Current Home Url = Expected Home Url");

// accept Cookie
        String iD = "hs-eu-confirmation-button";
        driver.findElement(By.id(iD)).click();

// find 'Contact' and click WebElement
        String xpath = "//span[text()='Contact']";
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();

//  Assert 'Tab Title' after opening 'Contact' page
        String expectedTitle = "Softvision - Contact";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        System.out.println("Assertion successful: Current Title = Expected Title");

// Assert proper 'Contact' page has been opened
        String expectedContactUrl = "https://www.softvision.com/contact/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedContactUrl);
        System.out.println("Assertion successful: Current Contact Url = Expected Url");


// stop driver
        driver.close();

    }



}
*/


