package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	public WebDriver driver;
	
		@Given("^I am on Flighaware home page$")
	    public void i_am_on_flighaware_home_page() {
	    
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://uk.flightaware.com/");
			System.out.println("Website opened");
	    }

	    @When("^I key in AirIndia flight number \"([^\"]*)\"$")
	    public void i_key_in_airindia_flight_number_something(String flightnumber) {
	    driver.findElement(By.xpath("//input[@type= 'text]")).sendKeys(flightnumber);
	    }

	    @And("^I click on Search$")
	    public void i_click_on_search()  {
	    driver.findElement(By.xpath("//button[@class= 'blue_button]")).click();
	    }
	    
	    @Then("^Flight status is displayed$")
	    public void flight_status_is_displayed() {
	    System.out.println(driver.getTitle());
	    }

	   
	    
	    @When("^I key in AirIndia flight number as below$")
	    public void i_key_in_airindia_flight_number_as_below() {
	    
	    }

}