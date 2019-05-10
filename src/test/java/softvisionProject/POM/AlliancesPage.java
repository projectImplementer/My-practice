package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlliancesPage extends BasePage {

    public AlliancesPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Alliances']"));
        System.out.println("------------------------");
        System.out.println("Alliances page was found.");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "//*[@id=\"customers_content\"]/div/div[1]/div[1]/img")
    WebElement acquiaPng;
    @FindBy(xpath = "//*[@id=\"customers_content\"]/div/div[1]/div[2]/div[1]")
    WebElement acquiaTitle;
    @FindBy(xpath = "//*[@id=\"customers_content\"]/div/div[2]/div[1]/img")
    WebElement adobePng;
    @FindBy(xpath = "//*[@id=\"customers_content\"]/div/div[2]/div[2]/div[1]")
    WebElement adobeTitle;
    @FindBy(xpath = "//div[@class='text']/p[contains(text(),'The goals of our Alliance program')]")
    WebElement innerText;
    //

    // Methods
    public void acquia () {
        acquiaPng.isDisplayed();
        acquiaTitle.isDisplayed();
        System.out.println("- acquia logo: pass");
        System.out.println("- acquia title: pass");
    }

    public void adobe() {
        adobePng.isDisplayed();
        adobeTitle.isDisplayed();
        System.out.println("- adobe logo: pass");
        System.out.println("- adobe title: pass");
    }

    public void text() {
        innerText.isDisplayed();
        System.out.println("- selected text is displayed: pass");
    }
    //


}
