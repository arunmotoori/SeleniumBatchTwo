package handingmultiplewindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement newPopupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		newPopupWindowLink.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windowId : windowIds) {
			if(!windowId.equals(parentWindowId)) {
				driver.switchTo().window(windowId);
				WebElement headingTextOnNewWindow = driver.findElement(By.xpath("//div[@class='example']/h3"));
				String popupWindowHeadingText = headingTextOnNewWindow.getText();
				System.out.println(popupWindowHeadingText);
				driver.close();
				break;
			}
		}
		
		driver.switchTo().window(parentWindowId);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		driver.quit();

	}

}
