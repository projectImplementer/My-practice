package softvisionProject.testcases.WorkWithUsPagesTestCases;

import org.testng.annotations.Test;
import softvisionProject.POM.HomePage;
import softvisionProject.POM.TrainingsPage;
import softvisionProject.testcases.BaseTest;

public class checkTitleParagraphAndIndiaBtn extends BaseTest {
// open work with us/trainings page from softvision.com and check the presence of TOJ and Pre-emp training titles
// and of their text bodies also, check if India btn is clickable.
//
    @Test
    public void checkTitlesAndParagraphs() {
        goToSoftVision();
        HomePage home = new HomePage(driver);
        home.acceptCookieMethod();
        home.hoverWorkWithUsBtn();
        openMenuPage("Trainings");
        TrainingsPage trainings = new TrainingsPage(driver);
        trainings.verifyTojTitle();
        trainings.verifyTojBody();
        trainings.verifyPreEmpTitle();
        trainings.verifyPreEmpBody();
        trainings.verifyIndiaBtn();
    }

}
