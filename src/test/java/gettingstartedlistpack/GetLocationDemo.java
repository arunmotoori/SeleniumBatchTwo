package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
//		WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
//		Point p = searchButton.getLocation();
//		System.out.println(p.x); // p.getX()
//		System.out.println(p.y); // p.getY()
		
		System.out.println(driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).getLocation().x);
		System.out.println(driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).getLocation().y);
		
		driver.quit();

	}

}
