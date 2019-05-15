package softvisionProject.framework;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;


public class JavaMap {


    public static HashMap<String, String> getNameEmail() {

        HashMap<String, String> nameEmail = new HashMap<String, String>();
        nameEmail.put("first", "bogdan_bogdan@mail.com");
        nameEmail.put("Second", "adrian_adrian@mail.com");
        nameEmail.put("Three", "java_java@mail.com");

        return nameEmail;
    }

    public HashMap<String, WebElement> getDropList(WebDriver driver) {

        List<WebElement> locations = driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select locationselect dropup open']//div[@class='dropdown-menu open' and @role='combobox']/ul/li/a/span[@class='text']"));
        // System.out.println(locations.size());  prints the number of selections the xpath generates
        HashMap<String, WebElement> dropList = new HashMap<String, WebElement>();
        for (WebElement item : locations) {
            dropList.put(item.getAttribute("innerHTML"), item);
            //System.out.println(item.getAttribute("innerHTML").trim()); // prints the name of the selection
        }
        return dropList;
    }

    public HashMap<String, WebElement> getExpertiseList(WebDriver driver) {

        List<WebElement> expertises = driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select guildselect dropup open']//div[@class='dropdown-menu open']/ul/li/a/span[@class='text']"));
        HashMap<String, WebElement> expertiseList = new HashMap<String, WebElement>();
        for (WebElement item : expertises) {
            expertiseList.put(item.getAttribute("innerHTML"), item);

        }
        return expertiseList;
    }

    public HashMap<String, WebElement> getRegardingList(WebDriver driver) {

        List<WebElement> regarding = driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select hs-input dropup open']//div[@class='dropdown-menu open']/ul/li/a/span[@class='text']"));
        HashMap<String, WebElement> regardingList = new HashMap<String, WebElement>();
        for (WebElement item : regarding) {
            regardingList.put(item.getAttribute("innerHTML"), item);

        }
        return regardingList;
    }
}

