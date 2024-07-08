package handingmultiplewindowspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutHandlingMultipleWindowsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement popupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		popupWindowLink.click();
		
		WebElement newWindowElement = driver.findElement(By.xpath("//div[@class='example']/h3"));
		String textOnNewWindow = newWindowElement.getText();
		
		System.out.println(textOnNewWindow);
	}

}
