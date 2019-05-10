package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RPAPage extends BasePage {

    public RPAPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//a[contains(text(),'RPA')]"));
        System.out.println("------------------------");
        System.out.println("Robotic Process automation page was found.");
        System.out.println("------------------------");
    }
}
