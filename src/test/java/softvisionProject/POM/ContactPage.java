package softvisionProject.POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import softvisionProject.framework.JavaMap;


import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static softvisionProject.framework.JavaMap.getDropList;
import static softvisionProject.framework.JavaMap.getNameEmail;


public class ContactPage extends BasePage {

    public ContactPage item;

    public ContactPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Contact']"));
        System.out.println("-----------------------");
        System.out.println("Contact page was found.");
        System.out.println("-----------------------");

    }

    // HashMap Implementation for name and email from HashMap.class
    String informationUtil = getNameEmail().get("first");
    String provide[] = informationUtil.split("_");
    //

    // HashMap Implementation for drop-down list from HashMap.class
    String dropDownUtil = getDropList();

    //

    // Page Factory
    @FindBy(xpath = "//*[@id=\"firstname-ab348b60-7918-48db-b045-b90d8666eaf0\"]")
    WebElement InputName;
    @FindBy(xpath ="//*[@id=\"email-ab348b60-7918-48db-b045-b90d8666eaf0\"]")
    WebElement InputEmail;
    @FindBy(xpath = "//*[@id=\"hsForm_ab348b60-7918-48db-b045-b90d8666eaf0\"]/div[3]/div/div/div/button")
    WebElement RegardingList;
    @FindBy(xpath = "//*[@id=\"message-ab348b60-7918-48db-b045-b90d8666eaf0\"]")
    WebElement InputMessage;
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div[1]/div/div[1]/div/div/div[2]/div/h2/a/strong")
    WebElement austinStudio;
    //

    // Cucumber Methods
    public void InputNameCucumber(){
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        if(InputName.isDisplayed()) {
            System.out.println("- name field display: pass");
            InputName.sendKeys(provide[0]);
        } else {
            System.out.println("- name field display: fail");
        }
    }
    public void InputEmailCucumber() {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        if (InputEmail.isDisplayed()) {
            System.out.println("- email field display: pass");
            InputEmail.sendKeys(provide[1]);
        } else {
            System.out.println("- email field display: fail");
        }
    }

    public void OpenDropDownListCucumber(String chooseFromList) {
        driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
        if (RegardingList.isDisplayed()) {
            System.out.println("- dropdown list display: pass");
            RegardingList.click();
            String dropDownElements = "//span[text()='" + chooseFromList + "']";
            WebElement contactDropDown = driver.findElement(By.xpath(dropDownElements));
            contactDropDown.click();
        } else {
            System.out.println("- dropdown list display: fail");
        }
    }
        //

    // Methods
    public void InputNamePlease(String getName){
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        if(InputName.isDisplayed()) {
            System.out.println("- name field display: pass");
            InputName.sendKeys(getName);
        } else {
            System.out.println("- name field display: fail");
        }
    }
    public void InputEmailPlease(String getEmail) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        if(InputEmail.isDisplayed()) {
            System.out.println("- email field display: pass");
            InputEmail.sendKeys(getEmail);
        } else {
            System.out.println("- email field display: fail");
        }
    }
    public void OpenDropDownList(String chooseFromList) {
        driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
        if (RegardingList.isDisplayed()) {
            System.out.println("- dropdown list display: pass");
            RegardingList.click();
            String dropDownElements = "//span[text()='" + chooseFromList + "']";
            WebElement contactDropDown = driver.findElement(By.xpath(dropDownElements));
            contactDropDown.click();
        } else {
            System.out.println("- dropdown list display: fail");
        }
    }
    public void InputMessagePlease(String getMessage) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        if(InputMessage.isDisplayed()) {
            System.out.println("- message field display: pass");
            InputMessage.sendKeys(getMessage);
        } else {
            System.out.println("- message field display: fail");
        }
    }
    public void austinStudio() {
        if (austinStudio.isDisplayed()) {
            System.out.println("- Austin button display: pass");
            austinStudio.click();
        } else {
            System.out.println("- Austin button display: fail");
            }
        }
        //

    }


