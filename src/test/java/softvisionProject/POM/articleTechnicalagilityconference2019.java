package softvisionProject.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class articleTechnicalagilityconference2019 extends BasePage {

    public articleTechnicalagilityconference2019(WebDriver driver) {
        super(driver);

        driver.findElement(By.xpath("//*[@id=\"post-24938\"]/div/div/div/h1"));
        System.out.println("------------------------");
        System.out.println("Technical Agility Conference 2019 page was found.");
        System.out.println("------------------------");
    }
}
