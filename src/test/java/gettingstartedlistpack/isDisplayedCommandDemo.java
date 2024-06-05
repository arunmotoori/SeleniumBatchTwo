package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement button2 = driver.findElement(By.id("but2"));
		WebElement button1 = driver.findElement(By.id("but1"));
		WebElement button3 = driver.findElement(By.id("hbutton"));
		
		System.out.println(button2.isDisplayed()); // true
		System.out.println(button1.isDisplayed()); // true
		System.out.println(button3.isDisplayed()); // false
		
		driver.quit();

	}

}
