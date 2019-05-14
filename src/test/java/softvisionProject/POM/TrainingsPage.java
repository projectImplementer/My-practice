package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainingsPage extends BasePage {

    public TrainingsPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Trainings']"));
        System.out.println("------------------------");
        System.out.println("Trainings page was found.");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div[1]")
    WebElement tojTitle;
    @FindBy(xpath = "//div[contains(text(),'Cognizant Softvision offers junior')]")
    WebElement tojBody;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]")
    WebElement preEmpTitle;
    @FindBy(xpath = "//div[contains(text(),'Pre-Employment Trainings are intensive')]")
    WebElement preEmpBody;
    @FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/button[2]")
    WebElement indiaBtn;
    //

    // Methods
    public void verifyTojTitle() {
        if(tojTitle.isDisplayed()) {
            System.out.println("- tojTitle found: pass");
        } else {
            System.out.println("- tojTitle found: fail");
        }
    }

    public void verifyTojBody() {
        if (tojBody.isDisplayed()) {
            System.out.println("- tojBody found: pass");
        } else {
            System.out.println("- tojBody found: fail");
        }
    }

    public void verifyPreEmpTitle() {
        if(preEmpTitle.isDisplayed()) {
            System.out.println("- pre-employment title found: pass");
        } else {
            System.out.println("- pre-employment title found: fail");
        }
    }

    public void verifyPreEmpBody() {
        if(preEmpBody.isDisplayed()) {
            System.out.println("- pre-employment body found: pass");
        } else {
            System.out.println("- pre-employment body found: fail");
        }
    }

    public void verifyIndiaBtn() {
        if(indiaBtn.isDisplayed()) {
            System.out.println("- India btn display: pass");
            indiaBtn.click();
        } else {
            System.out.println("- India btn display: fail");
        }
    }
    //

}
