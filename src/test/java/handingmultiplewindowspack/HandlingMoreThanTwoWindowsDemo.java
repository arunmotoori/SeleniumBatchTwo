package handingmultiplewindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMoreThanTwoWindowsDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement selenium143Link = driver.findElement(By.id("selenium143"));
		selenium143Link.click();
		
		WebElement popupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		popupWindowLink.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals("New Window")) {
				
				WebElement popupWindowHeading = driver.findElement(By.xpath("//div[@class='example']/h3"));
				String headingText = popupWindowHeading.getText();
				System.out.println(headingText);
				driver.close();
				
			}else if(driver.getTitle().contains("Selenium143")) {
				
				String pageURL = driver.getCurrentUrl();
				System.out.println(pageURL);
				driver.close();
				
			}
			
		}
		
		driver.switchTo().window(parentWindowId);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		//driver.quit();
		
	}

}
