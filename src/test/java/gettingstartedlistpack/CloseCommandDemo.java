package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCommandDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		
		//Thread.sleep(2000);
		
		driver.close(); // Ignore the socket exception
	
	}

}
