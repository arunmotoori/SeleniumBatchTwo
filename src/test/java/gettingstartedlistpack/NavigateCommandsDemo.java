package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommandsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		
//		Navigation nav = driver.navigate();
//		nav.to("https://www.qafox.com/");
		
		driver.navigate().to("https://www.qafox.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
//		driver.get("https://www.qafox.com/");
		
	}

}
