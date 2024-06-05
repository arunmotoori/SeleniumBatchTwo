package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCommandMultipleWindowsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.id("selenium143")).click();
		
		driver.close(); // Selenium current focus parent window will be closed

	}

}
