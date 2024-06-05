package gettingstartedlistpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURLCommandDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qafox.com/");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("li[id='menu-item-479'] a")).click();
		
		String currentPageURL = driver.getCurrentUrl();
		System.out.println(currentPageURL);

	}

}
