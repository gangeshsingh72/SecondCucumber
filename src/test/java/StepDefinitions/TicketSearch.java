package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketSearch {

    public static WebDriver driver;

    @Given("^I am on google Home page$")
    public void i_am_on_google_Home_page()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("A");
        System.setProperty("webdriver.chrome.driver","src/test/java/utilities/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://google.co.uk");
    }

    @When("^I access the Google Page$")
    public void i_access_the_Google_Page()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("B");

    }

    @Then("^I see google page title$")
    public void i_see_google_page_title()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("C");

        Assert.assertEquals(driver.getTitle(),"Google");
        driver.close();
    }

    @Given("^I am on Santander Home page$")
    public void i_am_on_Santander_Home_page() throws InterruptedException {
           driver = new ChromeDriver();
           driver.get("https://www.santander.co.uk");

    }

    @When("^I access the Santander Page$")
    public void i_access_the_Santander_Page()  {

    }

    @Then("^I see Santander page title$")
    public void i_see_Santander_page_title() {
           Assert.assertEquals(driver.getTitle().contains("Santander"),true);
           driver.close();

    }

    @Given("^I am on HSBC Home page$")
    public void i_am_on_HSBC_Home_page()  {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("https://www.HSBC.co.uk");

    }

    @When("^I access the HSBC Page$")
    public void i_access_the_HSBC_Page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I see HSBC page title$")
    public void i_see_HSBC_page_title() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(driver.getTitle().contains("HSBC"),true);
        driver.close();
    }

    @Given("^I am on Debehnams Home page$")
    public void i_am_on_Debehnams_Home_page()  {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("https://www.debenhams.com");

    }

    @When("^I access the Debehnams Page$")
    public void i_access_the_Debehnams_Page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I see Debehnams page title$")
    public void i_see_Debehnams_page_title()  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(driver.getTitle().contains("Debenhams"),true);
        driver.close();
    }

    @Given("^I am on Barclays Home page$")
    public void i_am_on_Barclays_Home_page()  {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("https://www.Barclays.co.uk");

    }

    @When("^I access the Barclays Page$")
    public void i_access_the_Barclays_Page()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I see Barclays page title$")
    public void i_see_Barclays_page_title()  {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(driver.getTitle().contains("Barclays"),true);
        driver.close();
    }

}
