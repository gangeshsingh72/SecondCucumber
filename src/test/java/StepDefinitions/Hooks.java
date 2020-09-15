/*

package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver","src/test/java/utilities/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://google.co.uk");
        System.out.println("This will print before every scenario");
    }

    @After
    public void afterScenario() {
        driver.quit();
        System.out.println("This will print after every scenario");
    }
}
*/