package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;


public class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // JS Executor
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //

    // Page Factory
    @FindBy(xpath = "/html/body/div/div/span/span/button")
    WebElement chatBotIframe;
    @FindBy(xpath = "//*[@id=\"uid-ctrl-5\"]")
    WebElement chatBox;
    //@FindBy(xpath = "//*[@id='leadinModal-230912']")
    //WebElement overlay;
    //

    // Methods
    // click accept on cookie.
    public void acceptCookieMethod() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String iD = "hs-eu-confirmation-button";
        driver.findElement(By.id(iD)).click();
        System.out.println("- cookie btn find and click: pass");

    }

    // hover the mouse btn over the text.
    public void hoverApproachBtn() {
        Actions action = new Actions(driver);
        String xpath = "//span[text()='Approach']";
        WebElement eNew = driver.findElement(By.xpath(xpath));
        action.moveToElement(eNew).build().perform();
        System.out.println("- hover approach btn: pass");
    }

    public void hoverWorkWithUsBtn() {
        Actions action = new Actions(driver);
        String xpath = "//span[text()='Work With Us']";
        WebElement eNew = driver.findElement(By.xpath(xpath));
        action.moveToElement(eNew).build().perform();
        System.out.println("- hover work with us btn: pass");
    }

    public void findAnyElement(String eName) {
        WebElement anyE = driver.findElement(By.linkText(eName));
        anyE.click();
        System.out.println("" + eName + " was found");
    }

    public void closePopUp(WebElement overlay) {
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"_hjRemoteVarsFrame\"]")));
        driver.switchTo().defaultContent();
    }

    public void clickPopUpSubscribe() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement layout1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leadinModal-230912\"]/div[2]/button")));
        layout1.click();
    }

    public void explicitWaitMethod(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement clickArticle = wait.until(ExpectedConditions.elementToBeClickable(element));
        js.executeScript("arguments[0].scrollIntoView();", clickArticle);
        clickArticle.click();
    }

    public void switchToFrame(By element) {
        driver.switchTo().frame(driver.findElement(element));
    }

    public void switchToMainFrame() {
        driver.switchTo().defaultContent();
    }

    public void checkIfElemIsDisplayedAndClickOnIt(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("- element is displayed: true");
            element.click();
        } else {
            System.out.println("- element is displayed: fail");
        }

    }


   /* public void removeOverlay() {
        if (overlay.isDisplayed()) {
            System.out.println("FOUND OVERLAY");
            js.executeScript("arguments[0].parentNode.removeChild(arguments[0])", overlay);
            System.out.println("REMOVING OVERLAY...");
            System.out.println("OVERLAY REMOVED");
        } else {
            System.out.println("NO OVERLAY TO CLOSE");
        }

    */
    }
    //




