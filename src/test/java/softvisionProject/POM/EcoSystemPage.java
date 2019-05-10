package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EcoSystemPage extends BasePage{

    public EcoSystemPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Our Approach']"));
        System.out.println("------------------------");
        System.out.println("EcoSystem page was found.");
        System.out.println("------------------------");
    }

    // JS Executor
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //


    // Page Factory
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/a/img")
    WebElement guilds;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[2]/div/a/img")
    WebElement pods;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[3]/div/a/img")
    WebElement studios;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[4]/div/a/img")
    WebElement transform;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[5]/div/a/img")
    WebElement labs;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[6]/div/a/img")
    WebElement alliances;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[2]/div[2]/i")
    WebElement rightArrow;
    @FindBy(xpath = "//*[@id=\"static_content\"]/div/div/div[2]/p/text()")
    WebElement text;
    @FindBy(xpath = "//*[@id=\"hubspot-messages-iframe-container\"]")
    WebElement hubspotBot;
    @FindBy(xpath = "//*[@id=\"hubspot-messages-iframe-container\"]/iframe")
    WebElement iframeRemove;
    //

    // Methods
    public void guilds() {
        if(guilds.isDisplayed()) {
            System.out.println("- guilds display: pass");
            guilds.click();
        } else {
            System.out.println("- guilds display: fail");
        }

    }
    public void pods() {
        if (pods.isDisplayed()) {
            System.out.println("- pods display: pass");
            pods.click();
        } else {
            System.out.println("- pods display: fail");
        }
    }
    public void studios() {
        if (studios.isDisplayed()) {
            System.out.println("- studios display: pass");
            studios.click();
        } else {
            System.out.println("- studios display: fail");
        }
    }
    public void transform() {
        if (transform.isDisplayed()) {
            System.out.println("- transform display: pass");
            transform.click();
        } else {
            System.out.println("- transform display: fail");
        }
    }
    public void labs() {
        if (labs.isDisplayed()) {
            System.out.println("- labs display: pass");
            labs.click();
        } else {
            System.out.println("- labs display: fail");
        }
    }
    public void alliances() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(alliances));
        if (alliances.isDisplayed()) {
            System.out.println("- alliances display: pass");
            alliances.click();
        } else {
            System.out.println("- alliances display: fail");
        }
    }
    public void rightArrow() {
        if(rightArrow.isDisplayed()) {
            System.out.println("- right arrow display: pass");
            Actions actions = new Actions(driver);
            actions.moveToElement(rightArrow).perform();
            actions.click().perform();
        } else {
            System.out.println("- right arrow display: fail");
        }
    }

    public void removeBot() {
        if (hubspotBot.isDisplayed()) {
            System.out.println();
            System.out.println("FOUND iFrame");
            js.executeScript("arguments[0].parentNode.removeChild(arguments[0])", hubspotBot);
            System.out.println("REMOVING iFrame...");
            System.out.println("iFrame REMOVED");
            System.out.println();
        } else {
            System.out.println("NO iFrame TO CLOSE");
        }
    }
    //


    /*public void text() {
        Assert.assertEquals(text, text);
        System.out.println("Body text found");
    } */
}
