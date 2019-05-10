package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage {

    public CareersPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Technology Jobs and Careers – Softvision']"));
        System.out.println("------------------------");
        System.out.println("Careers page was found.");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "//span[text()='Location / Studios']")
    WebElement location;
    @FindBy(xpath = "//span[text()='Expertise / Guilds']")
    WebElement expertise;
    @FindBy(xpath = "//*[@id=\"careers-search-job\"]/div[3]/input")
    WebElement searchField;
    @FindBy(xpath = "//span[text()='Search']")
    WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"first-section\"]/div/div/div[2]/h3")
    WebElement searchTitle;
    //

    // Methods
    public void clickLocation(String selectLocation) {
        if (location.isDisplayed()) {
            System.out.println("- location display: pass");
            location.click();
            String dropDownElements = "//span[contains(text(),'" + selectLocation + "')]";
            WebElement eNew42 = driver.findElement(By.xpath(dropDownElements));
            eNew42.click();
        }
        else {
            System.out.println("- location display: fail");
        }
        /* Locations available for selection:
        atlanta-ga
        austin-tx
        baia-mare
        bangalore
        boston-ma

         */
    }

    public void clickExpertise(String selectExpertise) {
        if (expertise.isDisplayed()) {
            System.out.println("- expertise display: pass");
            expertise.click();
            String dropDownElements = "//span[contains(text(),'" + selectExpertise + "')]";
            WebElement eNew42 = driver.findElement(By.xpath(dropDownElements));
            eNew42.click();
        }
        else {
            System.out.println("- expertise display: fail");
        }
    }

    public void searchField(String input) {
        if(searchField.isDisplayed()) {
            System.out.println("- search field display: pass");
            searchField.sendKeys(input);
        }
        else {
            System.out.println("- search field display: fail");
        }
    }

    public void searchButton() {
        if(searchBtn.isDisplayed()) {
            System.out.println("- search btn display: pass");
            searchBtn.click();
        }
        else {
            System.out.println("- search btn display: fail");
        }
    }

    public void title() {
        if(searchTitle.isDisplayed()) {
            System.out.println("- search title display: pass");
        }
        else {
            System.out.println("- search title display: fail");
        }
    }

    //

}
