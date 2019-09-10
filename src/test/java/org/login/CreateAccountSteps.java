package org.login;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CreateAccountSteps {
static WebDriver driver;
@Given("User should be in the home page")
public void user_should_be_in_the_home_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lokesh\\eclipse-workspace\\Cucumber\\drivers\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://www.gmail.com");
}
@Given("click create account button")
public void click_create_account_button() throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='Create account']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@aria-label='For myself']")).click();    
}
@When("user enters all the data")
public void user_enters_all_the_data() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("lokesh");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sureshh");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("lokeshsureshhhh");
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("lokeshsureshhhh12345");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("lokeshsureshhhh12345");
	}
@When("click next button")
public void click_next_button() {
	driver.findElement(By.xpath("//span[text()='Next']")).click();
}
@Then("user should be displayed next page is entered")
public void user_should_be_displayed_next_page_is_entered() {
	WebElement disp = driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']"));
	Assert.assertTrue(disp.isDisplayed());
}


}
