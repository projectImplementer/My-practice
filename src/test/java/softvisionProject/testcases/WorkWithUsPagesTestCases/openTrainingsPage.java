package softvisionProject.testcases.WorkWithUsPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.TrainingsPage;
import softvisionProject.testcases.BaseTest;

public class openTrainingsPage extends BaseTest {


    @Test
    public void searchFields() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverWorkWithUsBtn();
        openMenuPage("Trainings");
        TrainingsPage trainings = new TrainingsPage(driver);
    }
}
