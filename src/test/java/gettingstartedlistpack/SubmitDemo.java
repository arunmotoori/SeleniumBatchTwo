package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).submit();

	}

}
