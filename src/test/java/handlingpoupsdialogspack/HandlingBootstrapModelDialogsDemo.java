package handlingpoupsdialogspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingBootstrapModelDialogsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Click To Open Modal']"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close']")));
		
		String dialogHeading = driver.findElement(By.id("myModalLabel")).getText();
		System.out.println(dialogHeading);
		String dialogBodyText = driver.findElement(By.xpath("//div[@class='modal-body']/p")).getText();
		System.out.println(dialogBodyText);
		WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
		Thread.sleep(3000);
		closeButton.click();
		
		driver.quit();
		
	}

}
