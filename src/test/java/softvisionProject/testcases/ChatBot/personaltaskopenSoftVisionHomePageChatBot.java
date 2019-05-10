package softvisionProject.testcases.ChatBot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import softvisionProject.POM.BasePage;
import softvisionProject.POM.HomePage;
import softvisionProject.testcases.BaseTest;

public class personaltaskopenSoftVisionHomePageChatBot extends BaseTest {
//open and close the chatbot situated on the home page.
//
    @Test
    public void openSoftVision () {
        goToSoftVision();
        HomePage homeAssert = new HomePage(driver);
        homeAssert.acceptCookieMethod();
        homeAssert.switchToFrame(By.xpath("//*[@id=\"hubspot-messages-iframe-container\"]/iframe"));
        homeAssert.openChatBot();
        homeAssert.closeChatBot();
        homeAssert.switchToMainFrame();
    }

}
