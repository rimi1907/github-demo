package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dev.failsafe.internal.util.Assert;

public class LoginStepDefinition
{
	WebDriver driver;

	@Given("^User is on Login Page$")
	public void User_is_on_Login_Page()
	{

		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\ChromeDriver\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		String PageTitle= driver.getTitle();
		System.out.println("The Page Title is" +PageTitle);
	
	}
	
	@When("^User enters Emailaddress$")
	public void User_enters_Emailaddress() throws InterruptedException
	{
		WebElement Emailadress = driver.findElement(By.xpath("//input[@id='username']"));
		   Thread.sleep(4000);
		Emailadress.sendKeys("gargi123@gmail.com");
	}
	@Then ("^User Validate the Email Format")
	public void User_Validate_the_Email_Format()
	{
	
	}
	
	@And ("^User enters Password$")
	public void User_enters_Password() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Gargi@1907");
	
	}
	
	@Then ("^Login Button gets Enabled")
	public void Login_Button_gets_Enabled()
	{
		
		WebElement Login = driver.findElement(By.id("loginBtn"));

		if(Login.isEnabled())
		  {
		   System.out.print("\nLoginfield is enabled. Take your action.");
		  }
		  else
		  {
		   System.out.print("\nLoginfield is disabled. Take your action.");
		  }
		
		
	}
	
}
