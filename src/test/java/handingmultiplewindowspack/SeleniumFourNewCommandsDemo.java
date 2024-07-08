package handingmultiplewindowspack;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFourNewCommandsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindowId = driver.getWindowHandle();
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("My name is Arun Motoori.");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.qafox.com/");
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://selenium143.blogspot.com/");
		
		WebElement telegramGroupButton = driver.findElement(By.xpath("//a[@href='https://t.me/qafoxoriginal']"));
		telegramGroupButton.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		for(String windowId : windowIds) {
			
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals("Home - QAFox")) {
				
				String qafoxURL = driver.getCurrentUrl();
				System.out.println(qafoxURL);
				driver.close();
				
			}else if(driver.getTitle().contains("Selenium143")) {
				
				String selenium143URL = driver.getCurrentUrl();
				System.out.println(selenium143URL);
				driver.close();
				
			}else if(driver.getTitle().equals("Telegram: Contact @qafoxoriginal")) {
				
				System.out.println("I am on Telegram tab window");
				
			}
			
		}
		
		driver.switchTo().window(parentWindowId);
		textAreaField.clear();
		
		//driver.quit();
		
	}

}
