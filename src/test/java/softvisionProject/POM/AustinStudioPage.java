package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AustinStudioPage extends BasePage {

    public AustinStudioPage (WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//*[@id=\"gradient-background\"]/div/div/div/div/div/div/div/div/div/div/div/div/h1"));
        System.out.println("------------------------");
        System.out.println("Austin studio page was found.");
        System.out.println("------------------------");
    }
}
