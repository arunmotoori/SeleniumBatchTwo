package handlingcalendarspack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarFourDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		
		WebElement calendarField = driver.findElement(By.name("bdaytime"));
		
		calendarField.sendKeys("25112026");
		calendarField.sendKeys(Keys.TAB);
		calendarField.sendKeys("0930");
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
	}

}
