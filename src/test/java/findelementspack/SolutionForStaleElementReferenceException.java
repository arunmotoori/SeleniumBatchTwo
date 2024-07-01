package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SolutionForStaleElementReferenceException {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		int noOfLinks = links.size();
		
		for(int i=1;i<=noOfLinks;i++) {
			String linkXPath = "(//div[@id='LinkList1']//a)["+i+"]";
			WebElement link = driver.findElement(By.xpath(linkXPath));
			link.click();
			driver.navigate().back();
		}

	}

}
