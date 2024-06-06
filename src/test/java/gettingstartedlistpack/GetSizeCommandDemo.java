package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
//		WebElement searchBoxField = driver.findElement(By.name("search"));
//		Dimension d = searchBoxField.getSize();
//		System.out.println(d.height);
//		System.out.println(d.width);
//		System.out.println(d.getHeight());
//		System.out.println(d.getWidth());
		
		System.out.println(driver.findElement(By.name("search")).getSize().height);
		System.out.println(driver.findElement(By.name("search")).getSize().width);
		
		driver.quit();

	}

}
