package handlingpoupsdialogspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAcceptCookiesDialogDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.takealot.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement gotItButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Got it')]")));
		
		gotItButton.click();
	
	}

}
