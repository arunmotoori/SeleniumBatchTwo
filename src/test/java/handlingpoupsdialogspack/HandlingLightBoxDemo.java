package handlingpoupsdialogspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingLightBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49");
		
		WebElement image = driver.findElement(By.xpath("(//img[@alt='Samsung Galaxy Tab 10.1'])[1]"));
		image.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement xOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='×']")));
		
		Thread.sleep(3000);
		
		xOption.click();
		
		driver.quit();
		
	}

}
