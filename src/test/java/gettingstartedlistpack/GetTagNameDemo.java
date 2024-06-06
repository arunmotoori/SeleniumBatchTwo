package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String tagName = driver.findElement(By.id("ta1")).getTagName();
		System.out.println(tagName);
		
		driver.quit();
	}

}
