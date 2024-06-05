package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement searchBoxField = driver.findElement(By.name("search"));
		searchBoxField.sendKeys("HP");
		searchBoxField.sendKeys(Keys.ENTER);

	}

}
