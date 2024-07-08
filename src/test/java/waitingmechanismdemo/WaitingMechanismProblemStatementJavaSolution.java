package waitingmechanismdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitingMechanismProblemStatementJavaSolution {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDownButton = driver.findElement(By.className("dropbtn"));
		dropDownButton.click();
		
		Thread.sleep(10000);
		
		WebElement flipkartOption = driver.findElement(By.linkText("Flipkart"));
		flipkartOption.click();

	}

}
