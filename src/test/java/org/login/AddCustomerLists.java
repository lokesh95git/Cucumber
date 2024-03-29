package org.login;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class AddCustomerLists {
	static WebDriver driver;
	@Given("User should be in the telecom home pages")
	public void user_should_be_in_the_telecom_home_pages() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lokesh\\eclipse-workspace\\Cucumber\\drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@Given("click add customer buttons")
	public void click_add_customer_buttons() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
}

	@When("User enter all the datas")
	public void user_enter_all_the_datas() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("sureshh");
		driver.findElement(By.id("lname")).sendKeys("lokesh");
		driver.findElement(By.id("email")).sendKeys("lokeshsureshhhh12345@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("chennai");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
	    
	}
	@When("User enter all the datas.")
	public void user_enter_all_the_datas(DataTable cstList) {
		List<String> Lists = cstList.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(Lists.get(0));
		driver.findElement(By.id("lname")).sendKeys(Lists.get(1));
		driver.findElement(By.id("email")).sendKeys(Lists.get(2));
		driver.findElement(By.name("addr")).sendKeys(Lists.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(Lists.get(4));
	   
	}
	@When("User enter all the datass.")
	public void user_enter_all_the_datass(DataTable cstMap) {
		Map<String, String> Maps = cstMap.asMap(String.class,String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys(Maps.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(Maps.get("lname"));
		driver.findElement(By.id("email")).sendKeys(Maps.get("email"));
		driver.findElement(By.name("addr")).sendKeys(Maps.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(Maps.get("phno"));
	    
	}




	@When("click on submit buttons")
	public void click_on_submit_buttons() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user should be displayed customer id is enteredd")
	public void user_should_be_displayed_customer_id_is_enteredd() {
		WebElement cstId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	    Assert.assertTrue(cstId.isDisplayed());
	    }



}
