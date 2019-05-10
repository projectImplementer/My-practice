package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ClujNapocaStudioPage extends BasePage {

    public ClujNapocaStudioPage(WebDriver driver) {
        super(driver);


        driver.findElement(By.xpath("//title[text()='Cluj Napoca - Softvision']"));
        System.out.println("------------------------");
        System.out.println("ClujNapoca studio page was found.");
        System.out.println("------------------------");
        System.out.println("Test for future reference");
    }
}
