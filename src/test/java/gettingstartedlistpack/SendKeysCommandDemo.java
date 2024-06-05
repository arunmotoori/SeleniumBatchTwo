package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement searchBoxField = driver.findElement(By.name("q"));
		searchBoxField.sendKeys("Arun Motoori");
		
		WebElement textAreaField1 = driver.findElement(By.id("ta1"));
		textAreaField1.sendKeys("My name is Arun Motoori. I love Selenium Automation. Selenium is one of the most popular test automation tools that are available in the market. Selenium is a set of components like Selenium IDE, Selenium WebDriver and Selenium Grid. Selenium WebDriver is the main component of Selenium.");
		
		

	}

}
