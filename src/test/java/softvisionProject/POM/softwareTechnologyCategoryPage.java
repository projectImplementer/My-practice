package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class softwareTechnologyCategoryPage extends BasePage {

    public softwareTechnologyCategoryPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//span[text()='Software & Technology']"));

        System.out.println("-----------------------");
        System.out.println("Software & Technology category page found.");
        System.out.println("-----------------------");
    }

}
