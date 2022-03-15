package Midtrans.PageObjectModels;

import org.openqa.selenium.WebDriver;

public class HomePageObject {
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void NavigatetoUrl(String url) {
		driver.get(url);
	}
	

}
