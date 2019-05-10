package softvisionProject.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import softvisionProject.framework.helperClass;

import static softvisionProject.framework.helperClass.chooseBrowser;


public class approachPages {
    // use runDriver from helperClass GLOBALLY
    public WebDriver driver;

    public Actions action;

    public void openDesiredPage(String pageName) {
        String desiredPage = "//span[text()='" + pageName + "']";
        WebElement eNew1 = driver.findElement(By.xpath(desiredPage));
        eNew1.click();
    }
    public void urlAssert(String pageName){
        String expectedPageUrl = "https://www.softvision.com/"+ pageName +"/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedPageUrl);
        System.out.println(""+ pageName +" url: pass");
    }
    public void titleAssert(String titleName){
        String expectedTitle = "Softvision - "+ titleName +"";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        System.out.println(""+ titleName +" title: pass");
    }

    // open SoftVision and assert
    public void openHomeUrl() {
        driver.navigate().to("https://softvision.com");

        String expectedHomeUrl = "https://www.softvision.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedHomeUrl);
        System.out.println("Home url: pass");
    }

    public void acceptCookie() {
// accept Cookie
        String iD = "hs-eu-confirmation-button";
        driver.findElement(By.id(iD)).click();
    }

    public void openContactUrl() {
// find 'Contact' and click WebElement
        String xpath = "//span[text()='Contact']";
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();

//  Assert 'Tab Title' after opening 'Contact' page
        titleAssert("Contact");
//  Assert proper 'Contact' page has been opened
        urlAssert("contact");
    }

    public void hoverApproachBtn() {
        Actions action = new Actions(driver);
        String xpath = "//span[text()='Approach']";
        WebElement eNew = driver.findElement(By.xpath(xpath));
        action.moveToElement(eNew).build().perform();
        System.out.println("Hover Approach btn: pass");
    }

    public void openEcoSystemUrl() {
        String xpathEcoSystem = "//span[text()='Our Ecosystem']";
        WebElement eNew1 = driver.findElement(By.xpath(xpathEcoSystem));
        eNew1.click();

//Assert EcoSystem url
        urlAssert("approach");
    }

    public void openGuildsUrl() {
        hoverApproachBtn();
        openDesiredPage("Guilds");

//Assert Guilds url
        urlAssert("guilds");
    }

    public void openPodsUrl() {
        hoverApproachBtn();
        openDesiredPage("Pods");

//Assert Pods url
        urlAssert("pods");
    }

    public void openAlliancesUrl() {
        hoverApproachBtn();
        openDesiredPage("Alliances");

//Assert Alliances url
        urlAssert("alliances");
    }


    @BeforeTest
    public void a_print() {
        System.out.println("It works so far");
        driver = chooseBrowser("Chrome");

    }
    @Test
    public void openApproachPages() {
        openHomeUrl();
        acceptCookie();
        openContactUrl();
        hoverApproachBtn();
        openEcoSystemUrl();
        openGuildsUrl();
        openPodsUrl();
        openAlliancesUrl();
    }
    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}

