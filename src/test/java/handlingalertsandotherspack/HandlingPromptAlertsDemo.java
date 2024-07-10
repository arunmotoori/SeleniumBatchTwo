package handlingalertsandotherspack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPromptAlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement jsPromptButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		jsPromptButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		String textOnPromptAlert = alert.getText();
		System.out.println(textOnPromptAlert);
		alert.sendKeys("Arun Motoori");
		
		Thread.sleep(3000);
		
		//alert.accept();
		alert.dismiss();
		
	}

}
