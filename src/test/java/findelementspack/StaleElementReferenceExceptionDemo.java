package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		
		for(WebElement link : links) {
			link.click();
			driver.navigate().back();
		}

	}

}
