package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productDesignPage extends BasePage {

    public productDesignPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//*[@id=\"page-title\"]/div/h1"));
        System.out.println("------------------------");
        System.out.println("Product Design page found.");
        System.out.println("------------------------");
    }

    // Page Factory
    @FindBy(xpath = "//span[contains(text(),'full case')]")
    WebElement readTheFullCaseStudy;

    // Methods
    public void clickFullCaseStudy() {
        readTheFullCaseStudy.click();
    }
    //
}
