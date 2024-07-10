package handlingalertsandotherspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotHandlingAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement jsAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		jsAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Thread.sleep(3000);
				
		WebElement elementalSeleniumLink = driver.findElement(By.linkText("Elemental Selenium"));
		elementalSeleniumLink.click();
		
		
	}

}
