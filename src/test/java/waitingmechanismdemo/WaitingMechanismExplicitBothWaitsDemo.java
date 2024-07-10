package waitingmechanismdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMechanismExplicitBothWaitsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDownButton = driver.findElement(By.className("dropbtn"));
		dropDownButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement flipkartOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));

		flipkartOption.click();

	}

}
