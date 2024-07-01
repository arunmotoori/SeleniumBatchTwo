package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAndTagNameDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for(WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		
		driver.quit();

	}

}
