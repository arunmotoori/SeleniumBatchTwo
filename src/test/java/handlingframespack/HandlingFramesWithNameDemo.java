package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesWithNameDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.switchTo().frame("classFrame");
		
		WebElement descriptionLink = driver.findElement(By.linkText("Description"));
		descriptionLink.click();
		
		

	}

}
