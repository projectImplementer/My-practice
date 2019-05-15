package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import softvisionProject.framework.JavaMap;

import java.util.HashMap;
import java.util.Set;


import static softvisionProject.framework.JavaMap.getNameEmail;

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
    WebElement locationz;
    @FindBy(xpath = "//span[text()='Expertise / Guilds']")
    WebElement expertisez;
    @FindBy(xpath = "//*[@id=\"careers-search-job\"]/div[3]/input")
    WebElement searchField;
    @FindBy(xpath = "//span[text()='Search']")
    WebElement searchBtn;
    @FindBy(xpath = "//*[@id=\"first-section\"]/div/div/div[2]/h3")
    WebElement searchTitle;
    //


    // HashMap methods - get the LOCATION / STUDIOS drop down list items
    public void selectLocations(String name) {
        if (locationz.isDisplayed()) {
            System.out.println("- location displayed");
            locationz.click();
            System.out.println("location display clicked");
            JavaMap test = new JavaMap();
            HashMap <String, WebElement> dropDownList = test.getDropList(driver);
                for (String location: dropDownList.keySet()) {
                    if (location.contains(name)) {
                    System.out.println("location by name found");
                    System.out.println("Name taken " + name);
                    dropDownList.get(location).click();
                    break;
                    } else {
                    System.out.println("The desired location " + name + " cannot be found in this list");
                    }
                }
        } else {
                System.out.println("- location not displayed");
        }
    }

    // HashMap methods - get the EXPERTISE / GUILDS drop down list items
    public void selectExpertise(String name) {
        if (expertisez.isDisplayed()) {
            System.out.println("- expertise displayed");
            expertisez.click();
            System.out.println("- expertise not displayed");
            JavaMap test = new JavaMap();
            HashMap <String, WebElement> expertiseList = test.getExpertiseList(driver);
                for(String expertise: expertiseList.keySet()) {
                    if (expertise.contains(name)) {
                        System.out.println("Expertise found : " + name);
                        expertiseList.get(expertise).click();
                        break;
                    } else {
                    System.out.println("The desired expertise " + name + " cannot be found in this list");
                    }
                }
        }
    }
    //

    // Methods
    public void clickLocation(String selectLocation) {
        if (locationz.isDisplayed()) {
            System.out.println("- location displayed");
            locationz.click();
            String dropDownElements = "//span[contains(text(),'" + selectLocation + "')]";
            WebElement eNew42 = driver.findElement(By.xpath(dropDownElements));
            eNew42.click();
        } else {
            System.out.println("- location not displayed");
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
        if (expertisez.isDisplayed()) {
            System.out.println("- expertise displayed");
            expertisez.click();
            String dropDownElements = "//span[contains(text(),'" + selectExpertise + "')]";
            WebElement eNew42 = driver.findElement(By.xpath(dropDownElements));
            eNew42.click();
        } else {
            System.out.println("- expertise not displayed");
        }
    }

    public void searchField(String input) {
        if(searchField.isDisplayed()) {
            System.out.println("- search field display: pass");
            searchField.sendKeys(input);
        } else {
            System.out.println("- search field display: fail");
        }
    }

    public void searchButton() {
        if(searchBtn.isDisplayed()) {
            System.out.println("- search btn display: pass");
            searchBtn.click();
        } else {
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
