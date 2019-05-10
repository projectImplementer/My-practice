package softvisionProject.testcases.ChatBot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import softvisionProject.POM.BasePage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class personaltasksendRepliesToTheChatBot extends BaseTest {

    @Test (priority = 1)
    public void openSoftVision() {
        goToSoftVision();
        HomePage homeAssert = new HomePage(driver);
        homeAssert.acceptCookieMethod();
        homeAssert.switchToFrame(By.xpath("//*[@id=\"hubspot-messages-iframe-container\"]/iframe"));
        homeAssert.openChatBot();
        homeAssert.sendMessageToBot("Maximus");
    }

}
