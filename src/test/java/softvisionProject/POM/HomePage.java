package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[contains(text(),'Softvision')]"));
      /*  System.out.println();
        System.out.println("Home page found.");
        System.out.println("-----------------------");
        */

    }


    // Page Factory
    @FindBy(xpath = "/html/body/div/div")
    WebElement botIdea;
    @FindBy(xpath = "//*[@id=\"video-controls\"]/div")
    WebElement pausePlayVideo;
    @FindBy(xpath = "//*[@id=\"video-controls\"]/span")
    WebElement muteUnmuteSound;
    @FindBy(xpath = "//*[@id=\"ticker\"]/div/div[2]/div[1]/i")
    WebElement sliderLeftArrow;
    @FindBy(xpath = "//*[@id=\"ticker\"]/div/div[2]/div[3]/i")
    WebElement sliderRightArrow;
    @FindBy(xpath = "//span[text()='Solutions']")
    WebElement solutionsPage;
    @FindBy(xpath = "//*[@id=\"revele_1\"]/div[1]")
    WebElement solutionsPageTitle;
    @FindBy(xpath = "//span[text()='GET IN TOUCH']")
    WebElement getInTouchBtn;
    @FindBy(css = "#run > div > ul > li:nth-child(4) > a")
    WebElement rpaBtn;
    @FindBy(xpath = "//*[@id=\"where-we-are\"]/div/div/div[2]/div[11]")
    WebElement mapDotCluj;
    @FindBy(xpath = "//*[@id=\"where-we-are\"]/div/div/div[2]/div[24]/div[11]/div[1]/a")
    WebElement inDotViewStudioBtn;
    @FindBy(xpath = "/html/body/div[2]/div/header/div[3]/div/div/div/div/span/img[2]")
    WebElement searchBtn;
    @FindBy(css= "body > div.wrapper > div > header > div.header_inner.clearfix > div > div > div > div > span > img.white-search")
    WebElement allDropDownList;
    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement searchBar;
    @FindBy(xpath = "//*[@id=\"search-top\"]/div/span")
    WebElement clearSearch;
    //

    // JS Executor
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //


    // Methods
    public void openChatBot() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        chatBotIframe.click();
    }

    public void closeChatBot() {
        chatBotIframe.click();
    }

    public void sendMessageToBot(String name) {
        chatBox.sendKeys(name);
    }

    public void pausePlayVideo() {
        pausePlayVideo.click();
    }

    public void muteUnmuteSound() {
        muteUnmuteSound.click();
    }

    public void sliderLeftArrow() {
        for (int i = 0; i < 6; i++) {
            sliderLeftArrow.click();
        }
    }

    public void sliderRightArrow() {
        for (int i = 0; i < 6; i++) {
            sliderRightArrow.click();
        }
    }

    public void solutionsPage() {
        if (solutionsPage.isDisplayed()) {
            System.out.println("- solutions tab display: pass");
            solutionsPage.click();
            js.executeScript("arguments[0].scrollIntoView();", solutionsPageTitle);
        } else {
            System.out.println("- solutions tab display: fail");
        }

    }

    public void getInTouchBtn() {
        if(getInTouchBtn.isDisplayed()) {
            System.out.println("- get in touch btn display: pass");
            getInTouchBtn.click();
        } else {
            System.out.println("- get in touch btn display: fail");
        }
    }

    public void rpaBtn() {
        if(rpaBtn.isDisplayed()) {
            System.out.println("- RPA btn display: pass");
            rpaBtn.click();
        } else {
            System.out.println("- RPA btn display: fail");
        }
    }

    public void mapDotCluj() {
        if(mapDotCluj.isDisplayed()){
            System.out.println("- ClujNapoca map dot display: pass");
            mapDotCluj.click();
        } else {
            System.out.println("- ClujNapoca map dot display: fail");
        }
    }

    public void inDotViewStudioBtn() {
        if(inDotViewStudioBtn.isDisplayed()){
            System.out.println("- studio button display: pass");
            js.executeScript("arguments[0].scrollIntoView();", inDotViewStudioBtn);
            inDotViewStudioBtn.click();
        } else {
            System.out.println("- studio button display: fail");
        }
    }

    public void searchBtn() {
        searchBtn.click();
    }

    public void allDropDownList(String chooseElement) {
        allDropDownList.click();
        String dropDownElements = "//span[text()='" + chooseElement + "']";
        WebElement searchBarDropDownElement = driver.findElement(By.xpath(dropDownElements));
        searchBarDropDownElement.click();
        /* elements to choose from:
        All
        Insights
        News
        Client Stories
         */
    }

    public void searchBar(String input) {
        searchBar.sendKeys(input);
    }

    public void clearSearch() {
        clearSearch.click();
    }
    //
}
