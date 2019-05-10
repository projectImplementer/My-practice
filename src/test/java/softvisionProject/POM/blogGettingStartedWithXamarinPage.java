package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import softvisionProject.testcases.BaseTest;

public class blogGettingStartedWithXamarinPage extends BasePage {

    public blogGettingStartedWithXamarinPage(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//a[@href='https://www.softvision.com/blog/getting-started-xamarin/']"));
        System.out.println("-----------------------");
        System.out.println("Xamarin blog page found.");
        System.out.println("-----------------------");
    }
}
