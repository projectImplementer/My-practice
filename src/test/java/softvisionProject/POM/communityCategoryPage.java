package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class communityCategoryPage extends BasePage {

    public communityCategoryPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//title[text()='Softvision - Community Archives']"));
        System.out.println("------------------------");
        System.out.println("Community category page was found.");
        System.out.println("------------------------");
    }

}
