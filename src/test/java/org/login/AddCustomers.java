package org.login;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomers {
	
	static WebDriver driver;
	
	@Given("User should be in the telecom home page")
	public void user_should_be_in_the_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lokesh\\eclipse-workspace\\Cucumber\\drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("click add customer button")
	public void click_add_customer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	    
	}

	@When("User enter all the data")
	public void user_enter_all_the_data() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("sureshh");
		driver.findElement(By.id("lname")).sendKeys("lokesh");
		driver.findElement(By.id("email")).sendKeys("lokeshsureshhhh12345@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
	    
	}

	@When("click on submit button")
	public void click_on_submit_button() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("user should be displayed customer id is entered")
	public void user_should_be_displayed_customer_id_is_entered() {
		WebElement cstId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	    Assert.assertTrue(cstId.isDisplayed());
	}



}
