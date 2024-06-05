package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//driver.findElement(By.id("alert1")).click();
		//driver.findElement(By.linkText("jqueryui")).click();
		//driver.findElement(By.id("radio1")).click();
//		driver.findElement(By.id("checkbox1")).click();
//		driver.findElement(By.id("checkbox2")).click();
		//driver.findElement(By.name("q")).click();
		//driver.findElement(By.id("ta1")).click();
		
	}

}
