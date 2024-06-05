package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeCommandDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String buttonLabel = driver.findElement(By.xpath("//input[@class='gsc-search-button']")).getAttribute("value");
		System.out.println(buttonLabel);
		
		String buttonType = driver.findElement(By.xpath("//input[@class='gsc-search-button']")).getAttribute("type");
		System.out.println(buttonType);
		
		driver.quit();
	}

}
