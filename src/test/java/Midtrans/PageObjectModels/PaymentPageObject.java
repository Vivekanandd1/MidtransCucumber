package Midtrans.PageObjectModels;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class PaymentPageObject {
	WebDriver driver;
	private By otpXpath = By.xpath("//div[@class='form-group']//input");
	private String otp = "112233";
	private By buttonOKXpath = By.xpath("//button[@name='ok']");
	
	public PaymentPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public void paymentPAGE() throws IOException {
		WebElement fswich3 = driver.findElement(By.tagName("iframe"));
	    driver.switchTo().frame(fswich3);
	    WebElement fswich4 = driver.findElement(By.tagName("iframe"));
	    driver.switchTo().frame(fswich4);
	    driver.findElement(otpXpath).sendKeys(otp);
	    driver.findElement(buttonOKXpath).click();
//	 	String path = "target/ScreenShots/"+LocalDate.now()+".jpg";
//	    File filemids = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    Files.copy(filemids,new File(path));
	
	}
	public void closeDriver() {
		driver.quit();		
	}

}
