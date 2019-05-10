package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class designThinkingCategoryPage extends BasePage {

    public designThinkingCategoryPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//div[@id='mCSB_1_container']//span[text()='Design thinking']"));
        System.out.println("------------------------");
        System.out.println("Design thinking category page was found.");
        System.out.println("------------------------");
    }
}
