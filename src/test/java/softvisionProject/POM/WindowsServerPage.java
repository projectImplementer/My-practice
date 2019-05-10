package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsServerPage extends BasePage {

    public WindowsServerPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//span[text()='GET IN TOUCH']"));
        System.out.println("------------------------");
        System.out.println("Windows Server page was found.");
        System.out.println("------------------------");

    }
}
