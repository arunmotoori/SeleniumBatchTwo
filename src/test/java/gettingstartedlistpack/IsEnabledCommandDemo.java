package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button2 = driver.findElement(By.id("but2"));
		WebElement button1 = driver.findElement(By.id("but1"));
		
		System.out.println(button2.isEnabled()); // true
		System.out.println(button1.isEnabled()); // false
		
		boolean b2 = button2.isEnabled();
		System.out.println(b2);
		
		boolean b1 = driver.findElement(By.id("but1")).isEnabled();
		System.out.println(b1);
		
		driver.quit();

	}

}
