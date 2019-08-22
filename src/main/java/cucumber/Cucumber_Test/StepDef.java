package cucumber.Cucumber_Test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;

	@Given("^User launch facebook application$")
	public void user_launch_facebook_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KaVi\\eclipse-workspace\\Maven\\Cucumber_Test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

	@Given("^User check url and title$")
	public void user_check_url_and_title() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("facebook")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		String title = driver.getTitle();
		System.out.println(title);
		Date d = new Date();
		System.out.println(d);

	}

	@When("^User enter username$")
	public void user_enter_username() {
		driver.findElement(By.id("email")).sendKeys("Vidya");

	}

	@When("^User enter password$")
	public void user_enter_password() {
		driver.findElement(By.id("pass")).sendKeys("Hi@1234a");

	}

	@When("^User click loginbutton$")
	public void user_click_loginbutton() {
		driver.findElement(By.id("loginbutton")).click();

	}

	@Then("^User check navigate correct url or not$")
	public void user_check_navigate_correct_url_or_not() {
		String url2 = driver.getCurrentUrl();
		if (url2.contains("attempt")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		Date d = new Date();
		System.out.println(d);

	}

	@Then("^User close the browser$")
	public void user_close_the_browser() {
		driver.quit();

	}

}
