package handlingcalendarspack;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarOneDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Month: say March:");
		String expectedMonth = scanner.nextLine();
		System.out.println("Enter any Year: say 2025:");
		String expectedYear = scanner.nextLine();
		System.out.println("Enter any date: say 13:");
		String expectedDate = scanner.nextLine();
		scanner.close();
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement calendarField = driver.findElement(By.id("datepicker"));
		selectDateInCalendar(calendarField,driver,expectedDate,expectedMonth,expectedYear);
		
		
	}
	
	public static void selectDateInCalendar(WebElement calendar,ChromeDriver driver,String day,String month,String year) {
		
		calendar.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nextOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
		
		WebElement actualMonthElement = driver.findElement(By.className("ui-datepicker-month"));
		String actualMonth = actualMonthElement.getText();
		
		WebElement acutalYearElement = driver.findElement(By.className("ui-datepicker-year"));
		String acutalYear = acutalYearElement.getText();
	
		while(!(actualMonth.equals(month) && acutalYear.equals(year))) {
			nextOption = driver.findElement(By.xpath("//span[text()='Next']"));
			nextOption.click();
			actualMonthElement = driver.findElement(By.className("ui-datepicker-month"));
			actualMonth = actualMonthElement.getText();
			acutalYearElement = driver.findElement(By.className("ui-datepicker-year"));
			acutalYear = acutalYearElement.getText();
		}
		
		String dateXpathText = "//a[@class='ui-state-default'][text()='"+day+"']";
		WebElement dateElement = driver.findElement(By.xpath(dateXpathText));
		dateElement.click();
	}

}
