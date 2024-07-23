package handlingcalendarspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarOneDemo {

	public static void main(String[] args) {
		
		String expectedMonth = "November";
		String expectedYear = "2028";
		String expectedDate = "25";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		WebElement calendarField = driver.findElement(By.id("datepicker"));
		calendarField.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nextOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
		
		WebElement actualMonthElement = driver.findElement(By.className("ui-datepicker-month"));
		String actualMonth = actualMonthElement.getText();
		
		WebElement acutalYearElement = driver.findElement(By.className("ui-datepicker-year"));
		String acutalYear = acutalYearElement.getText();
	
		while(!(actualMonth.equals(expectedMonth) && acutalYear.equals(expectedYear))) {
			nextOption = driver.findElement(By.xpath("//span[text()='Next']"));
			nextOption.click();
			actualMonthElement = driver.findElement(By.className("ui-datepicker-month"));
			actualMonth = actualMonthElement.getText();
			acutalYearElement = driver.findElement(By.className("ui-datepicker-year"));
			acutalYear = acutalYearElement.getText();
		}
		
		String dateXpathText = "//a[@class='ui-state-default'][text()='"+expectedDate+"']";
		WebElement dateElement = driver.findElement(By.xpath(dateXpathText));
		dateElement.click();
		
	}

}
