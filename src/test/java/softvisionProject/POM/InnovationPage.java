package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InnovationPage extends BasePage {

    public InnovationPage(WebDriver driver){
        super(driver);

        driver.findElement(By.xpath("//title[text()='Innovation Labs']"));

        System.out.println("------------------------");
        System.out.println("Innovation Page was found.");
        System.out.println("------------------------");

    }

    // Javascript executor
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //

    // Page Factory
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/section[5]/div[1]/button[1]")
    WebElement identify;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/section[5]/div[1]/button[2]")
    WebElement prototype;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/section[5]/div[1]/button[3]")
    WebElement partner;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/section[5]/div[1]/button[4]")
    WebElement roadmap;
    @FindBy(css = "#cards-slider > div > div.owl-stage-outer > div > div:nth-child(6) > div > div > div.card-header > a > h4")
    WebElement innovateOrburst;
    //

    // Methods
    public void identify() {
        if(identify.isDisplayed()) {
            System.out.println("- identify display: pass");
            identify.click();
        } else {
            System.out.println("- identify display: fail");
        }
    }

    public void prototype() {
        if(prototype.isDisplayed()) {
            System.out.println("- prototype display: pass");
            prototype.click();
        } else {
            System.out.println("- prototype display: fail");
            prototype.click();
        }
    }

    public void partner() {
        if(partner.isDisplayed()) {
            System.out.println("- partner display: pass");
            partner.click();
        } else {
            System.out.println("- partner display: fail");
        }
    }

    public void roadmap() {
        if(roadmap.isDisplayed()) {
            System.out.println("- roadmap display: pass");
            roadmap.click();
        } else {
            System.out.println("- roadmap display: fail");
        }
    }

    public void innovateBurst() {
        if(innovateOrburst.isDisplayed()) {
            System.out.println("- innovateOrburst display: pass");
            innovateOrburst.click();
        } else {
            System.out.println("- innovateOrburst display: fail");
        }
    }
    //

}

