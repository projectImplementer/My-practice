package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class GuildsPage extends BasePage {

    public GuildsPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Guilds']"));
        System.out.println("------------------------");
        System.out.println("Guilds page found.");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "//*[@id=\"post_20349\"]/div/div[1]/a[1]")
    WebElement softTech; //from article "Getting started with Xamarin".
    @FindBy(xpath = "//*[@id=\"post_20349\"]/div/div[1]/a[3]")
    WebElement xamarin; //from article "Getting started with Xamarin".
    @FindBy(xpath = "//*[@id=\"post_20349\"]/a/span")
    WebElement readMore; //from article "Getting started with Xamarin".
    @FindBy(xpath = "//span[text()='GET IN TOUCH TO FIND OUT MORE']")
    WebElement findOutBtn; //from the bottom of the page "Get in touch to find out more". It opens a contact form.
    @FindBy(xpath = "//*[@id=\"modal_hubspot\"]/button")
    WebElement closeOverlayForm; //close the form that opens.
    //

    //Methods
    public void softTech() {
        if (softTech.isDisplayed()) {
            System.out.println("- software & technology click: pass");
            softTech.click();
        } else {
            System.out.println("- software & technology click: fail");
        }
    }

    public void xamarin() {
        if(xamarin.isDisplayed()) {
            System.out.println("- xamarin click: pass");
            xamarin.click();
        } else {
            System.out.println("- xamarin click: fail");
        }
    }

    public void readMore() {
        if(readMore.isDisplayed()) {
            System.out.println("- read more btn is present: pass");
            readMore.click();
        } else {
            System.out.println("- read more btn is present: fail");
        }
    }

    public void findOutMore() {
        if(findOutBtn.isDisplayed()){
            System.out.println("- btn is clicked: pass");
            findOutBtn.click();
        } else {
            System.out.println("- btn is clicked: fail");
        }
    }

    public void closeOverlayForm() {
        if(closeOverlayForm.isDisplayed()) {
            System.out.println("- overlay close: pass");
            closeOverlayForm.click();
        } else {
            System.out.println("- overlay close: fail");
        }
    }
    //
}





