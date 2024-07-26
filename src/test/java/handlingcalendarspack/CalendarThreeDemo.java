package handlingcalendarspack;

import java.time.Duration;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarThreeDemo {

	public static void main(String[] args) {
		
		String expectedDay = "11";
		String expectedMonthText = "October";
		String expectedYearText = "2024";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement calendarField = driver.findElement(By.id("datepicker"));
		calendarField.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		WebElement actualYearElement = driver.findElement(By.className("ui-datepicker-year"));
		String actualYearText = actualYearElement.getText();
		
		int expectedYear = Integer.parseInt(expectedYearText);
		int actualYear = Integer.parseInt(actualYearText);
		
		if(expectedYear<actualYear) {
			
			while(expectedYear!=actualYear) {
				
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
				actualYearElement = driver.findElement(By.className("ui-datepicker-year"));
				actualYearText = actualYearElement.getText();
				actualYear = Integer.parseInt(actualYearText);
				
			}
		
		}else if(expectedYear>actualYear){
			
			while(expectedYear!=actualYear) {
			
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				actualYearElement = driver.findElement(By.className("ui-datepicker-year"));
				actualYearText = actualYearElement.getText();
				actualYear = Integer.parseInt(actualYearText);
			
			}
			
		}
		
		String actualMonthText = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		int actualMonth = Month.valueOf(actualMonthText.toUpperCase()).getValue();
		int expectedMonth = Month.valueOf(expectedMonthText.toUpperCase()).getValue();
		
		if(expectedMonth < actualMonth) {
			
			while(expectedMonth!=actualMonth) {
				
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
				actualMonthText = driver.findElement(By.className("ui-datepicker-month")).getText();
				actualMonth = Month.valueOf(actualMonthText.toUpperCase()).getValue();
				
			}
		
		}else if(expectedMonth > actualMonth) {
			
			while(expectedMonth!=actualMonth) {
				
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				actualMonthText = driver.findElement(By.className("ui-datepicker-month")).getText();
				actualMonth = Month.valueOf(actualMonthText.toUpperCase()).getValue();
				
			}
			
		}
		
		String dayXPathText = "//a[text()='"+expectedDay+"']";
		driver.findElement(By.xpath(dayXPathText)).click();
		
	}

}
