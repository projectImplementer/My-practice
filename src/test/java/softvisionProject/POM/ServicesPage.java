package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends BasePage {

    public ServicesPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Services']"));
        driver.findElement(By.linkText("Define user journeys"));

        System.out.println("------------------------");
        System.out.println("Services Page was found");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "//*[@id=\"page-title\"]/div")
    WebElement title;
    @FindBy(xpath = "//*[@id=\"static_image_video\"]/div/div/div[1]/div/div/div/img")
    WebElement playBtnOverlay;
    @FindBy(xpath = "//button[@aria-label='Play']")
    WebElement playBtnOnYoutube;
    @FindBy(xpath = "//*[@id=\"solutions_content\"]/div/div/div[1]/div[1]/a[1]")
    WebElement guildsAiHashTag;
    @FindBy(xpath = "//*[@id=\"solutions_content\"]/div/div/div[4]/div[2]/ul/li[4]")
    WebElement shiftToMicroservices;
    @FindBy(xpath = "//*[@id=\"solutions_content\"]/div/div/div[3]/div[2]/ul/li[3]/a")
    WebElement userJourneys;
    //

    //JS Executor
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //

    // Methods
    public void verifyTitle() {
        if (title.isDisplayed()) {
            System.out.println("- title display: pass");
        } else {
            System.out.println("- title display: fail");
        }
    }

    public void playWeArePeopleVideo() {
        if(playBtnOverlay.isDisplayed()) {
            System.out.println("- video overlay btn display: pass");
            playBtnOverlay.click();
            switchToFrame(By.xpath("//iframe[contains(@src, 'https://www.youtube.com/embed')]"));
            playBtnOnYoutube.click();
            switchToMainFrame();
        } else {
            System.out.println("- video overlay btn display: fail");
        }

    }

    public void listItem() {
        if (shiftToMicroservices.isDisplayed()){
            js.executeScript("arguments[0].scrollIntoView();", shiftToMicroservices);
            System.out.println("- list item display: pass");
        } else {
            System.out.println("- list item display: fail");
        }
    }

    public void defineUserJourneys() {
        if(userJourneys.isDisplayed()) {
            System.out.println("- user journeys display: pass");
            userJourneys.click();
        } else {
            System.out.println("- user journeys display: fail");
        }
    }
    //
}
