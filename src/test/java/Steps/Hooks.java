package Steps;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import softvisionProject.testcases.BaseTest;

import static softvisionProject.framework.helperClass.chooseBrowser;

public class Hooks extends BaseTest{

    /* private BaseTest base;

    public Hooks() { } //empty constructor

    public Hooks(BaseTest base) {
        this.base = base;
    }
    */


    @Before
    public void initializeTest() {
        driver = chooseBrowser("chrome");
        System.out.println("start the browser");
        goToSoftVision();
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("quit the browser");
    }
}
