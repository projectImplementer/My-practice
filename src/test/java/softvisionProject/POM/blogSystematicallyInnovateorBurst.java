package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class blogSystematicallyInnovateorBurst extends BasePage {

    public blogSystematicallyInnovateorBurst(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//*[@id=\"post-19197\"]/div/div/div/h1"));
        System.out.println("------------------------");
        System.out.println("blog systematically innovate or burst page was found.");
        System.out.println("------------------------");
    }
}
