package Midtrans.STEPDEFS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Midtrans.PageObjectModels.HomePageObject;
import Midtrans.PageObjectModels.PaymentPageObject;
import Midtrans.PageObjectModels.PillowShoppingPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class STEPDEFS {
	WebDriver driver;
	String URL = "https://demo.midtrans.com/";
	HomePageObject homePageObject;
	PillowShoppingPage pillowShoppingPage;
	PaymentPageObject paymentPageObject;
	
	@Given("user opened Browser")
	public void user_opened_browser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		homePageObject = new HomePageObject(driver);
		pillowShoppingPage = new PillowShoppingPage(driver);
		paymentPageObject = new PaymentPageObject(driver);
	    
	}

	@Given("User is on home page")
	public void user_is_on_home_page() {
	    homePageObject.NavigatetoUrl(URL);
	}
	@When("User buy pillow")
	public void user_buy_pillow() {
	   pillowShoppingPage.buyPillowPage();
	}
	@Then("Successful payment done")
	public void successful_payment_done() throws IOException {
		paymentPageObject.paymentPAGE();
		paymentPageObject.closeDriver();
	}
    
	
}
