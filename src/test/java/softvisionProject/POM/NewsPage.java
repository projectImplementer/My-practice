package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class NewsPage extends BasePage {

    public NewsPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - News']"));
        System.out.println("------------------------");
        System.out.println("News page was found.");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "//*[@id=\"post-25057\"]/div[1]/a")
    WebElement article1;
    @FindBy(xpath = "//article[@id='post-25057']//a[text()='Design thinking']")
    WebElement designThinking;
    @FindBy(xpath = "//article[@id='post-25030']//a[text()='Company news']")
    WebElement companyNews;
    @FindBy(xpath = "//article[@id='post-25202']//a[text()='Community']")
    WebElement community;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div[1]/div[1]/ul/li[3]/a")
    WebElement eventsTab;
    @FindBy(xpath = "//article[@id='post-24938']//a[text()='Technical Agility Conference 2019']")
    WebElement eventsTabArticle1;

    //

    // Methods
    public void article1() {
        article1.click();
    }
    public void designThinking() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(designThinking));
        if (designThinking.isDisplayed()) {
            System.out.println("- design thinking btn display: pass");
            designThinking.click();
        } else {
            System.out.println("- design thinking btn display: fail");
        }
    }
    public void clickCompanyNewsBtn() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(companyNews));
        checkIfElemIsDisplayedAndClickOnIt(companyNews);
    }
    public void clickCommunityBtn() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(community));
        checkIfElemIsDisplayedAndClickOnIt(community);
    }
    public void eventsTab() {
        if (eventsTab.isDisplayed()) {
            System.out.println("- events tab display: pass");
            eventsTab.click();
        } else {
            System.out.println("- events tab display: fail");
        }
    }
    public void eventsTabArticle1() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading' and @style='position: absolute; width: 100%; height: 100%; background: rgba(250, 250, 250, 0.8); z-index: 10001; text-align: center; display: initial; left: 0px; top: 0px;']")));
        wait.until(ExpectedConditions.elementToBeClickable(eventsTabArticle1));
        if(eventsTabArticle1.isDisplayed()) {
            System.out.println("- article nr.1 display: pass");
            eventsTabArticle1.click();
        } else {
            System.out.println("- article nr.1 display: fail");
        }
    }
    //

}
