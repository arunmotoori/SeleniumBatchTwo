package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
//		WebElement searchBoxField = driver.findElement(By.name("search"));
//		Rectangle rect = searchBoxField.getRect();
//		System.out.println(rect.height);
//		System.out.println(rect.width);
//		System.out.println(rect.x);
//		System.out.println(rect.y);
		
		driver.quit();

	}

}
