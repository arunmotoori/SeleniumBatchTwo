package handlingcalendarspack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSixDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement dateField = driver.findElement(By.id("sixth_date_picker"));
		js.executeScript("arguments[0].scrollIntoView();",dateField);
		
		WebElement datePickerIcon = driver.findElement(By.className("ui-datepicker-trigger"));
		datePickerIcon.click();
		
		//Write code here to select day, month and year in the displayed calendar
		
	}

}
