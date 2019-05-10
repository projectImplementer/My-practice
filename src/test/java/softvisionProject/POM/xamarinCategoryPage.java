package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xamarinCategoryPage extends BasePage {

    public xamarinCategoryPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//span[text()='Xamarin']"));
        System.out.println("-----------------------");
        System.out.println("Xamarin category page was found.");
        System.out.println("-----------------------");
    }
}
