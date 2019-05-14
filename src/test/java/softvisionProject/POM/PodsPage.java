package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PodsPage extends BasePage {

    public PodsPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Pods']"));
        System.out.println("------------------------");
        System.out.println("Pods page was found.");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/a/img")
    WebElement podMitosis;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[2]/div/a/img")
    WebElement framework;
    @FindBy(xpath = "//*[@id=\"slider_with_content\"]/div[1]/div[2]/div/div[1]/div/div[3]/div/a/div")
    WebElement gameOfPods;
    @FindBy(xpath = "//*[@id=\"static_content\"]/div/div/div[1]/img")
    WebElement podPng;
    @FindBy(xpath = "//*[@id=\"static_image_video\"]/div/div/div[2]/div/p[1]")
    WebElement innovationP1;
    //

    // Methods
    public void clickPodMitosis() {
        if (podMitosis.isDisplayed()) {
            System.out.println("- pod mitosis: pass");
            podMitosis.click();
        }
        else{
            System.out.println("- pod mitosis: fail");
        }
    }

    public void clickFramework() {
        if (framework.isDisplayed()) {
            System.out.println("- framework: pass");
            framework.click();
        } else {
            System.out.println("- framework: fail");
        }
    }

        public void clickGameOfPods() {
            if (gameOfPods.isDisplayed()) {
                System.out.println("- game of pods: pass");
                gameOfPods.click();
            } else {
                System.out.println("- game of pods: fail");
            }
        }

        public void checkPodPng() {
            if (podPng.isDisplayed()) {
                System.out.println("- pod chart display: pass");
            } else{
                System.out.println("- pod chart display: fail");
            }
        }

        public void checkInnovationFirstParagraph(){
            if (innovationP1.isDisplayed()) {
                System.out.println("- first paragraph found: pass");
            } else{
                System.out.println("- first paragraph found: fail");
            }
        }
     //
    }



