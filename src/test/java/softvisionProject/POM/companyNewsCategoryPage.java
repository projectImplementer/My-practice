package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class companyNewsCategoryPage extends BasePage {

    public companyNewsCategoryPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//div[@class='row']/@href  |  //a[@class='selected']"));
        System.out.println("------------------------");
        System.out.println("Company News category page was found.");
        System.out.println("------------------------");
    }
}
