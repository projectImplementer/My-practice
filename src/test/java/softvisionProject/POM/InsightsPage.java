package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class InsightsPage extends BasePage {

    public InsightsPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Insights from our technology experts – Softvision']"));
        System.out.println("------------------------");
        System.out.println("Insights page is open.");
        System.out.println("------------------------");

    }

    //JS Executor
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //

    // Page Factory
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div/a[2]")
    WebElement ReadMore;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/button/span[1]")
    WebElement IndustriesList;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/div[3]/div/button/span[1]")
    WebElement GuildsList;
    @FindBy(linkText = "Show More")
    WebElement ShowMore;
    @FindBy(xpath = "//*[@id=\"postcarousel\"]/div[2]/div[2]")
    WebElement rightArrowScroll;
    @FindBy(xpath = "//*[@id=\"post-24951\"]/div[2]/div/div/h5/a")
    WebElement designJam;
    @FindBy(xpath = "//*[@id='leadinModal-230912']")
    WebElement overlay;
    @FindBy(xpath = "//*[@id=\"post-25165\"]/div[2]/div/div/h5/a")
    WebElement matiBaldi;
    //

    // Methods
    public void clickReadMore() {
        if (ReadMore.isDisplayed()) {
            System.out.println("- read more btn display: pass");
            ReadMore.click();
        } else {
            System.out.println("- read more btn display: fail");
        }
    }

    public void clickIndustries(String chooseIndustry) {
        if (IndustriesList.isDisplayed()) {
            System.out.println("- industries list btn display: pass");
            IndustriesList.click();
            String dropDownElements = "//span[text()='" + chooseIndustry + "']";
            WebElement eNew41 = driver.findElement(By.xpath(dropDownElements));
            eNew41.click();
        } else {
            System.out.println("- industries list btn display: fail");
        }
        /*Possible industries:
        Agriculture
        All Industries
        Financial Services
        Healthcare & Pharma
        Insurance
        Media & Entertainment
        Oil & Gas
        Retail
        Software & Technology
        Travel & Hospitality
         */
    }

    public void clickGuilds(String chooseGuild) {
        if (GuildsList.isDisplayed()) {
            System.out.println("- guilds list display: pass");
            GuildsList.click();
            String dropDownElements = "//span[text()='" + chooseGuild + "']";
            WebElement eNew42 = driver.findElement(By.xpath(dropDownElements));
            eNew42.click();
        } else {
            System.out.println("- guilds list display: fail");
        }
        /*Possible guilds:
        Design & UX
        Play
         */
    }

    public void clickShowMore() {
        if (ShowMore.isDisplayed()) {
            System.out.println("- show more btn display: pass");
            js.executeScript("arguments[0].scrollIntoView();", ShowMore);
            ShowMore.click();
        } else {
            System.out.println("- show more btn display: fail");
        }
    }

    public void clickRightArrow() {
        js.executeScript("arguments[0].scrollIntoView();", rightArrowScroll);
        if (rightArrowScroll.isDisplayed()) {
            System.out.println("- clicking right arrow 7 times: pass");
            for (int i = 0; i < 8; i++) {
                rightArrowScroll.click();
                //click the arrow 7 times.
            }
        } else {
            System.out.println("- clicking right arrow 7 times: fail");
        }
    }

    public void articleDesignJam() {
        if (designJam.isDisplayed()) {
            System.out.println("- design jam display: pass");
            designJam.click();
        } else {
            System.out.println("- design jam display: fail");
        }

    }

    public void removeOverlay() {
        if (overlay.isDisplayed()) {
            System.out.println();
            System.out.println("FOUND OVERLAY");
            js.executeScript("arguments[0].parentNode.removeChild(arguments[0])", overlay);
            System.out.println("REMOVING OVERLAY...");
            System.out.println("OVERLAY REMOVED");
            System.out.println();
        } else {
            System.out.println("NO OVERLAY TO CLOSE");
        }
    }


    public void openMatiBaldiArticle() {
        if (matiBaldi.isDisplayed()) {
            System.out.println("- article mati baldi display: pass");
            matiBaldi.click();
        } else {
            System.out.println("- article mati baldi display: fail");
        }
        //
    }
}
 /*   public void clickPopUpSubscribe() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(layout1));
        layout1.click();

    }

  */